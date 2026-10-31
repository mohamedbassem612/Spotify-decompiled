package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mm5 {
    public final int a;
    public final int b;

    public mm5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm5)) {
            return false;
        }
        mm5 mm5Var = (mm5) obj;
        return this.a == mm5Var.a && this.b == mm5Var.b;
    }

    public final int hashCode() {
        int i = this.a;
        return l1d.C(this.b) + ((i == 0 ? 0 : l1d.C(i)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionCustomEventFieldMapping(section=");
        sb.append(pzm.t(this.a));
        sb.append(", field=");
        switch (this.b) {
            case 1:
                str = "VALUE_TO_SUM";
                break;
            case 2:
                str = "EVENT_TIME";
                break;
            case 3:
                str = "EVENT_NAME";
                break;
            case 4:
                str = "CONTENT_IDS";
                break;
            case 5:
                str = "CONTENTS";
                break;
            case 6:
                str = "CONTENT_TYPE";
                break;
            case 7:
                str = "DESCRIPTION";
                break;
            case 8:
                str = "LEVEL";
                break;
            case 9:
                str = "MAX_RATING_VALUE";
                break;
            case 10:
                str = "NUM_ITEMS";
                break;
            case 11:
                str = "PAYMENT_INFO_AVAILABLE";
                break;
            case 12:
                str = "REGISTRATION_METHOD";
                break;
            case 13:
                str = "SEARCH_STRING";
                break;
            case 14:
                str = "SUCCESS";
                break;
            case 15:
                str = "ORDER_ID";
                break;
            case 16:
                str = "AD_TYPE";
                break;
            case 17:
                str = "CURRENCY";
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
