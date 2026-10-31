package p;

import com.spotify.libs.connect.events.proto.AccessoryStateEvent;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dj implements dwo {
    public final kly0 a;
    public final kly0 b;
    public final q8n c;
    public final c9n d;
    public final LinkedHashMap e;
    public int f;

    public dj(kly0 kly0Var, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, q8n q8nVar) {
        this.a = kly0Var4;
        this.b = kly0Var5;
        this.c = q8nVar;
        llm llmVarT = cy30.t(q8nVar);
        this.d = llmVarT;
        this.e = new LinkedHashMap();
        c9n c9nVarV = qmo1.v(llmVarT, new g3(this, (byte) 2));
        this.d = c9nVarV;
        c921.y(c9nVarV, (o8n) null, 0, new bh(kly0Var2, kly0Var, kly0Var3, this, (lnm) null, (byte) 1), 3);
    }

    public static void a(dj djVar, hi hiVar, String str, int i, String str2) {
        String lowerCase;
        int i2;
        cn70 cn70Var;
        ndr ndrVar = (ndr) djVar.a.get();
        int i3 = djVar.f;
        String strValueOf = String.valueOf(((yqg) djVar.b.get()).b());
        if (((qi) hiVar).e == 4) {
            lowerCase = xcg1.m(((qi) hiVar).e).toLowerCase(Locale.ROOT);
        } else {
            ii iiVarA = hiVar.a();
            lowerCase = (iiVarA == null || (i2 = iiVarA.b) == 0) ? "unknown" : x0d.u(i2).toLowerCase(Locale.ROOT);
        }
        qi qiVar = (qi) hiVar;
        axo1 axo1Var = qiVar.h;
        boolean z = axo1Var instanceof ji;
        boolean z2 = axo1Var instanceof ii;
        String strA = null;
        if (qiVar.e != 3) {
            hiVar = null;
        }
        if (hiVar != null && (cn70Var = ((qi) hiVar).i) != null) {
            strA = cn70Var.a();
        }
        if (strA == null) {
            strA = "";
        }
        ndrVar.getClass();
        bk bkVarN = AccessoryStateEvent.n();
        bkVarN.y(i3);
        bkVarN.s("notified_by_os");
        bkVarN.t(strValueOf);
        bkVarN.n(str);
        bkVarN.q(lowerCase);
        bkVarN.A(z);
        bkVarN.z(z2);
        bkVarN.w();
        bkVarN.x(i);
        bkVarN.v();
        bkVarN.u(str2);
        bkVarN.r(strA);
        AccessoryStateEvent accessoryStateEventBuild = bkVarN.build();
        Objects.toString(accessoryStateEventBuild);
        t2j0 t2j0Var = ndrVar.a;
        accessoryStateEventBuild.getClass();
        t2j0Var.a(accessoryStateEventBuild);
        djVar.f++;
    }

    public final void b(String str, ti tiVar) {
        ndr ndrVar = (ndr) this.a.get();
        int i = this.f;
        String strValueOf = String.valueOf(((yqg) this.b.get()).b());
        int i2 = this.f;
        String str2 = new String();
        ndrVar.getClass();
        bk bkVarN = AccessoryStateEvent.n();
        bkVarN.y(i);
        bkVarN.s(tiVar.e());
        bkVarN.t(strValueOf);
        bkVarN.n("built_in_speaker");
        bkVarN.q("Built-in");
        bkVarN.A(false);
        bkVarN.z(false);
        bkVarN.w();
        bkVarN.x(i2);
        bkVarN.v();
        bkVarN.u(str);
        bkVarN.r(str2);
        AccessoryStateEvent accessoryStateEventBuild = bkVarN.build();
        Objects.toString(accessoryStateEventBuild);
        t2j0 t2j0Var = ndrVar.a;
        accessoryStateEventBuild.getClass();
        t2j0Var.a(accessoryStateEventBuild);
        this.f++;
    }

    public final void shutdown() {
        smo1.q(this.d);
    }
}
