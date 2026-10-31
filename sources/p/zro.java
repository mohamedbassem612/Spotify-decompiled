package p;

import com.comscore.streaming.ContentDistributionModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zro {
    public String a;
    public short b;
    public int c;
    public float d;

    public final zro a() {
        zro zroVar = new zro();
        zroVar.c = os00.INVALID_ID;
        zroVar.d = Float.NaN;
        zroVar.a = this.a;
        zroVar.b = this.b;
        zroVar.c = this.c;
        zroVar.d = this.d;
        return zroVar;
    }

    public final String b() {
        return this.a;
    }

    public final String toString() {
        String strK = gvg.k(new StringBuilder(), this.a, ':');
        switch (this.b) {
            case 900:
                return strK + this.c;
            case ContentDistributionModel.TV_AND_ONLINE /* 901 */:
                return strK + this.d;
            case ContentDistributionModel.EXCLUSIVELY_ONLINE /* 902 */:
                String str = "00000000" + Integer.toHexString(this.c);
                return strK.concat("#".concat(str.substring(str.length() - 8)));
            case 903:
                return strK.concat("null");
            default:
                return strK.concat("????");
        }
    }
}
