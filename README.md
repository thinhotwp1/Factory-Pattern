# Factory-Pattern
Factory Pattern Sample + DI - Dependency Injection 

Link drive:

https://drive.google.com/drive/folders/1G37j6zV-WPexZ2dD2OIzMRJeG1KadAUt?usp=drive_link


🔷 
1. Pattern này giúp ẩn đi khởi tạo của các đối tượng con, bằng cách sử dụng các lớp abstract và class extends nó, có thể sử dụng chung hoặc sử dụng riêng method của các lớp cha và con (cũng là một lợi thế của factory pattern khi có nhiều method lặp lại ở các class extends). 
2. Có thể khởi tạo một class con tùy theo ý muốn theo hàm khởi tạo mong muốn.
3. Điều này giúp dễ maintain hơn khi có một đối tượng mới cần khởi tạo chỉ cần extends lớp abstract cha và được sử dụng những method chung ở class cha.
4. Nếu hư hỏng ở class con nào chỉ cần sửa ở class con đó
5. Nếu thay đổi cách tạo đối tượng trong tương lai, chỉ cần thay đổi trong Factory hoặc lớp con Factory, mà không ảnh hưởng đến mã chương trình chính.

🐳 Sử dụng trong những trường hợp nào: 

1. Cần ẩn quá trình khởi tạo: Khi quá trình tạo đối tượng là phức tạp và bạn muốn ẩn đi chi tiết của nó khỏi mã chương trình chính, Factory Pattern là lựa chọn tốt.

2. Tạo đối tượng đa dạng: Khi bạn cần tạo ra nhiều kiểu đối tượng khác nhau dựa trên các điều kiện hoặc tham số, Factory Pattern giúp quản lý việc tạo các đối tượng khác nhau một cách dễ dàng.

3. Tích hợp với Dependency Injection: Factory Pattern có thể kết hợp tốt với Dependency Injection để cung cấp đối tượng thích hợp cho các thành phần khác nhau của ứng dụng.

4. Dễ dàng mở rộng và bảo trì: Khi bạn dự định thêm mới kiểu đối tượng hoặc cần sửa đổi cách tạo đối tượng mà không ảnh hưởng đến mã chương trình chính, Factory Pattern là lựa chọn tốt để giảm sự rủi ro trong việc bảo trì và mở rộng.

5. Giảm sự phụ thuộc: Khi bạn muốn giảm sự phụ thuộc giữa mã chương trình chính và cách tạo đối tượng, Factory Pattern giúp tạo ra một lớp trung gian để tương tác với việc tạo đối tượng. ▶️

