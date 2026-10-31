package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m0b implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public m0b(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.u3);
                break;
            case 2:
                this.b = Collections.singleton(blc0.jf);
                break;
            case 3:
                this.b = Collections.singleton(blc0.F4);
                break;
            default:
                this.b = Collections.singleton(blc0.u2);
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
                return j0b.class;
            case 1:
                return i1m.class;
            case 2:
                return bv01.class;
            default:
                return rr61.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        switch (this.a) {
            case 0:
                String strZ = s4b1Var.z();
                String str = strZ != null ? strZ : "";
                String stringExtra = intent.getStringExtra("key_edit_name");
                if (stringExtra != null) {
                    return new l0b(str, stringExtra);
                }
                hhg1.n("Required value was null.");
                return null;
            case 1:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    hhg1.n("Chat URI cannot be null");
                    return null;
                }
                Set set = s4b1.f;
                String strB = pcf.b(uic.x(intent.getDataString()));
                if (strB != null) {
                    return new k1m(dataString, strB);
                }
                hhg1.n("Chat ID cannot be null");
                return null;
            case 2:
                Uri data = intent.getData();
                String strJ = data != null ? hyo1.j(data) : null;
                Uri data2 = intent.getData();
                return new dv01(data2 != null ? hyo1.i(data2) : null, strJ);
            default:
                Set set2 = s4b1.f;
                String strK = zjy.k(intent);
                return new ps61(strK != null ? strK : "", th61Var.a);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "A page for editing Blends";
            case 1:
                return "Pick gifs to add as contributions to the chat";
            case 2:
                return "The page contains the recently played items of the user";
            default:
                return "Settings page for podcast auto-downloads";
        }
    }
}
