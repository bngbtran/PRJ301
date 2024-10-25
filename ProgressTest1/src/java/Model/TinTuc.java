package Model;

public class TinTuc 
    {
        private int id;
        private String tieuDe;
        private String noiDung;
        private String tacGia;
        private int luotXem;
        private String ngayTao;
        private String xem;

        public TinTuc() 
            {
            }

        public TinTuc(int id, String tieuDe, String noiDung, String tacGia, int luotXem, String ngayTao, String xem) 
            {
                this.id = id;
                this.tieuDe = tieuDe;
                this.noiDung = noiDung;
                this.tacGia = tacGia;
                this.luotXem = luotXem;
                this.ngayTao = ngayTao;
                this.xem = xem;
            }

        public int getId() 
            {
                return id;
            }

        public void setId(int id) 
            {
                this.id = id;
            }

        public String getTieuDe() 
            {
                return tieuDe;
            }

        public void setTieuDe(String tieuDe) 
            {
                this.tieuDe = tieuDe;
            }

        public String getNoiDung() 
            {
                return noiDung;
            }

        public void setNoiDung(String noiDung) 
            {
                this.noiDung = noiDung;
            }   

        public String getTacGia() 
            {
                return tacGia;
            }

        public void setTacGia(String tacGia) 
            {
                this.tacGia = tacGia;
            }

        public int getLuotXem() 
            {
                return luotXem;
            }

        public void setLuotXem(int luotXem) 
            {
                this.luotXem = luotXem;
            }

        public String getNgayTao() 
            {
                return ngayTao;
            }   

        public void setNgayTao(String ngayTao) 
            {
                this.ngayTao = ngayTao;
            }   

        public String getXem() 
            {
                return xem;
            }

        public void setXem(String xem) 
            {
                this.xem = xem;
            }
    }