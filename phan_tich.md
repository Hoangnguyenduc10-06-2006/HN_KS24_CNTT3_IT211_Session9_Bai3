Phần 1 phân tích

Hiệu năng tốt hơn: Khi log level bị tắt (ví dụ DEBUG không bật), chuỗi nối bằng + vẫn được tạo ra trong bộ nhớ, gây tốn CPU và GC. Với {}, chuỗi chỉ được render khi thực sự cần ghi log

Đọc code gọn gàng: {} giúp tách rõ message template và dữ liệu, dễ nhìn hơn so với chuỗi nối dài dòng

An toàn & linh hoạt: {} tự động gọi toString() của object, tránh lỗi null và dễ mở rộng khi truyền nhiều tham số