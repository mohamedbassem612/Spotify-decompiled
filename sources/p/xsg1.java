package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xsg1 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public xsg1(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.bb);
                break;
            case 2:
                this.b = Collections.singleton(blc0.Mc);
                break;
            case 3:
                this.b = Collections.singleton(blc0.Nc);
                break;
            case 4:
                this.b = Collections.singleton(blc0.a8);
                break;
            case 5:
                this.b = Collections.singleton(blc0.Zj);
                break;
            default:
                this.b = Collections.singleton(blc0.nc);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return vsg1.class;
            case 1:
                return xgh1.class;
            case 2:
                return kph1.class;
            case 3:
                return yrh1.class;
            case 4:
                return e6m1.class;
            default:
                return tmm1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        switch (b) {
            case 0:
                return aqr0Var;
            case 1:
                return new zgh1(oon1.q(s4b1Var));
            case 2:
                String strJ = s4b1Var.j();
                return new mph1(strJ != null ? strJ : "");
            case 3:
                String strJ2 = s4b1Var.j();
                return new ash1(strJ2 != null ? strJ2 : "");
            case 4:
                String strO = s4b1Var.o(2);
                String str = "unknown";
                if (strO == null) {
                    strO = "unknown";
                }
                if (strO.length() > 0 && strO.length() < 1024) {
                    for (int i = 0; i < strO.length(); i++) {
                        char cCharAt = strO.charAt(i);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || (('0' <= cCharAt && cCharAt < ':') || cCharAt == '-' || cCharAt == '_'))) {
                        }
                    }
                    str = strO;
                }
                return new g6m1(str);
            default:
                return aqr0Var;
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Trial plan overview page";
            case 1:
                return "Impl of the main unboxing hub";
            case 2:
                return "Page for updating a child account's date of birth";
            case 3:
                return "Page for updating a child account's name";
            case 4:
                return "Prompted World chromeless web view";
            default:
                return "XR projected";
        }
    }
}
