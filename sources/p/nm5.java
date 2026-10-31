package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nm5 {
    public final int a;
    public final int b;

    public nm5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm5)) {
            return false;
        }
        nm5 nm5Var = (nm5) obj;
        return this.a == nm5Var.a && this.b == nm5Var.b;
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        int i = this.b;
        return iC + (i == 0 ? 0 : l1d.C(i));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionFieldMapping(section=");
        sb.append(pzm.t(this.a));
        sb.append(", field=");
        switch (this.b) {
            case 1:
                str = "ANON_ID";
                break;
            case 2:
                str = "FB_LOGIN_ID";
                break;
            case 3:
                str = "MAD_ID";
                break;
            case 4:
                str = "PAGE_ID";
                break;
            case 5:
                str = "PAGE_SCOPED_USER_ID";
                break;
            case 6:
                str = "USER_DATA";
                break;
            case 7:
                str = "ADV_TE";
                break;
            case 8:
                str = "APP_TE";
                break;
            case 9:
                str = "CONSIDER_VIEWS";
                break;
            case 10:
                str = "DEVICE_TOKEN";
                break;
            case 11:
                str = "EXT_INFO";
                break;
            case 12:
                str = "INCLUDE_DWELL_DATA";
                break;
            case 13:
                str = "INCLUDE_VIDEO_DATA";
                break;
            case 14:
                str = "INSTALL_REFERRER";
                break;
            case 15:
                str = "INSTALLER_PACKAGE";
                break;
            case 16:
                str = "RECEIPT_DATA";
                break;
            case 17:
                str = "URL_SCHEMES";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
