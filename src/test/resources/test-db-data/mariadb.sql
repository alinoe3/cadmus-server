INSERT INTO app_info
VALUES (1, 'Cadmus', 'Lorem ipsume dolor est...');

INSERT INTO person
VALUES (NEXTVAL(person_seq), 'alinoe', 'ch3cooh', 'Jan', 'Kovalsky', 'jan.kovalsky@xyz.pl');

INSERT INTO post
VALUES (NEXTVAL(post_seq),
        'MariaDB Sequences',
        'Traditionally, both MySQL and MariaDB relied on AUTO_INCREMENT columns to generate an IDENTITY Primary Key. Although IDENTITY columns are very efficient in generating the Primary Key value, when it comes to using JPA and Hibernate, the IDENTITY generator prevents us from using JDBC batch inserts.',
        'To automatically enroll multiple INSERT, UPDATE or DELETE statements, Hibernate requires delaying the SQL statement until the Persistence Context is flushed. This works very well for the SEQUENCE identifier since the entity identifier can be fetched prior to executing the INSERT statement. However, for IDENTITY columns, the only way to know the entity identifier is if we execute the SQL INSERT statement. And, Hibernate needs the entity identifier when persisting an entity because otherwise, it cannot build the key which is used for locating an entity in the currently running Persistence Context.',
        1,
        '2001-07-22 12:12:12');

INSERT INTO post
VALUES (NEXTVAL(post_seq),
        'Kernel 5.6.25',
        'Generate Lorem Ipsum placeholder text. Select the number of characters, words, sentences or paragraphs, and hit generate!',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed blandit libero volutpat sed cras. Aenean pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Sapien faucibus et molestie ac feugiat sed. Eget nunc lobortis mattis aliquam faucibus purus. Non arcu risus quis varius quam quisque id diam vel. Odio facilisis mauris sit amet massa vitae tortor condimentum lacinia. Velit aliquet sagittis id consectetur purus. Magna sit amet purus gravida quis blandit turpis cursus. Id velit ut tortor pretium viverra suspendisse potenti nullam ac. Nulla at volutpat diam ut venenatis tellus in metus vulputate. At lectus urna duis convallis convallis tellus id interdum velit. Diam in arcu cursus euismod quis. Velit laoreet id donec ultrices tincidunt arcu non sodales neque.',
        1,
        '2001-07-22 12:12:12');

INSERT INTO post
VALUES (NEXTVAL(post_seq),
        'How to Fetch Data in React Using the Fetch API ',
        'To do so, we make our request within the useEffect hook, and we make sure to provide an empty dependencies array as the second argument, so that our request is only made once (assuming it''s not dependent on any other data in our component).',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed blandit libero volutpat sed cras. Aenean pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Sapien faucibus et molestie ac feugiat sed. Eget nunc lobortis mattis aliquam faucibus purus. Non arcu risus quis varius quam quisque id diam vel. Odio facilisis mauris sit amet massa vitae tortor condimentum lacinia. Velit aliquet sagittis id consectetur purus. Magna sit amet purus gravida quis blandit turpis cursus. Id velit ut tortor pretium viverra suspendisse potenti nullam ac. Nulla at volutpat diam ut venenatis tellus in metus vulputate. At lectus urna duis convallis convallis tellus id interdum velit. Diam in arcu cursus euismod quis. Velit laoreet id donec ultrices tincidunt arcu non sodales neque.',
        1,
        '2001-08-22 12:02:12');

INSERT INTO post
VALUES (NEXTVAL(post_seq),
        'How to Fetch Data in React Using Axios',
        'What axios enables us to do is to use the exact same promise syntax as fetch – but instead of using our first then callback to manually determine whether the response is okay and throw an error, axios takes care of that for us.',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed blandit libero volutpat sed cras. Aenean pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Sapien faucibus et molestie ac feugiat sed. Eget nunc lobortis mattis aliquam faucibus purus. Non arcu risus quis varius quam quisque id diam vel. Odio facilisis mauris sit amet massa vitae tortor condimentum lacinia. Velit aliquet sagittis id consectetur purus. Magna sit amet purus gravida quis blandit turpis cursus. Id velit ut tortor pretium viverra suspendisse potenti nullam ac. Nulla at volutpat diam ut venenatis tellus in metus vulputate. At lectus urna duis convallis convallis tellus id interdum velit. Diam in arcu cursus euismod quis. Velit laoreet id donec ultrices tincidunt arcu non sodales neque.',
        1,
        '2001-01-26 5:01:12');

INSERT INTO post
VALUES (NEXTVAL(post_seq),
        'How to Fetch Data in React Using async',
        'If we take a look at the linting error that React gives us if we were using Create React App to build our project, we will be told that this function cannot be asynchronous to prevent race conditions. ',
        'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Sed blandit libero volutpat sed cras. Aenean pharetra magna ac placerat vestibulum lectus mauris ultrices eros. Sapien faucibus et molestie ac feugiat sed. Eget nunc lobortis mattis aliquam faucibus purus. Non arcu risus quis varius quam quisque id diam vel. Odio facilisis mauris sit amet massa vitae tortor condimentum lacinia. Velit aliquet sagittis id consectetur purus. Magna sit amet purus gravida quis blandit turpis cursus. Id velit ut tortor pretium viverra suspendisse potenti nullam ac. Nulla at volutpat diam ut venenatis tellus in metus vulputate. At lectus urna duis convallis convallis tellus id interdum velit. Diam in arcu cursus euismod quis. Velit laoreet id donec ultrices tincidunt arcu non sodales neque.',
        1,
        '2001-12-02 02:10:13');
