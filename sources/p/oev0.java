package p;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oev0 implements b031 {
    public final xmu0 a;
    public int b;
    public boolean c;
    public qa2 d;
    public final mr20 e;

    public oev0(Context context) {
        xmu0 xmu0Var = new xmu0(context);
        this.a = xmu0Var;
        this.e = rqt0.u(new nev0((xe01) ((yqu0) xmu0Var.c).b, (byte) 0));
    }

    public static final int c(boolean z, p811 p811Var) {
        Integer num;
        if (!z || (num = (Integer) p811Var.a) == null) {
            return 0;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 4;
        }
        return iIntValue;
    }

    public final void a(Bundle bundle) {
        this.d = null;
        ((bpb1) ((yqu0) this.a.c).c).m((Object) null, new aev0(bundle.getString("com.spotify.creator.creatorpage.popularreleases.selectedInternalId"), 1));
    }

    public final boolean b() {
        int i;
        Integer num;
        Object value;
        yqu0 yqu0Var = (yqu0) this.a.c;
        aev0 aev0Var = (aev0) ((xe01) yqu0Var.b).a.getValue();
        if (aev0Var.b == null) {
            i = 1;
        } else if (aev0Var.c() == null) {
            i = 3;
        } else {
            uod1 uod1VarC = aev0Var.c();
            if (uod1VarC == null || (num = uod1VarC.d) == null || num.intValue() != 0) {
                i = aev0Var.b().size() >= 2 ? 2 : 5;
            } else {
                i = 4;
            }
        }
        int iC = l1d.C(i);
        if (iC != 2 && iC != 3 && iC != 4) {
            return false;
        }
        bpb1 bpb1Var = (bpb1) yqu0Var.c;
        do {
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, aev0.a((aev0) value, null, null, 1)));
        return true;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putString("com.spotify.creator.creatorpage.popularreleases.selectedInternalId", ((aev0) ((xe01) ((yqu0) this.a.c).b).a.getValue()).b);
        return bundle;
    }
}
