package p;

import com.spotify.adsdisplay.embeddedad.events.proto.EmbeddedNPVAdEvent;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d1x implements tg61 {
    public final t2j0 a;
    public final mr20 b;
    public final yqg c;
    public ContextTrack d;
    public final llm e;

    public d1x(t2j0 t2j0Var, mr20 mr20Var, yqg yqgVar, q8n q8nVar) {
        this.a = t2j0Var;
        this.b = mr20Var;
        this.c = yqgVar;
        this.e = l1d.x(q8nVar);
    }

    public static void b(d1x d1xVar, int i, fq0 fq0Var, Map map, String str, int i2) {
        String strA;
        String strH;
        String strA0;
        String strUri;
        if ((i2 & 4) != 0) {
            map = b7x.a;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        d1xVar.getClass();
        int i3 = gr0.a;
        p2x p2xVarN = EmbeddedNPVAdEvent.n();
        ContextTrack contextTrack = d1xVar.d;
        if (contextTrack != null && (strUri = contextTrack.uri()) != null) {
            p2xVarN.v(strUri);
        }
        if (contextTrack != null && (strA0 = l4o1.a0(contextTrack, "context_uri")) != null) {
            p2xVarN.r(strA0);
        }
        if (fq0Var == null || (strA = fq0Var.a()) == null) {
            strA = "";
        }
        p2xVarN.n(strA);
        if (fq0Var != null && (strH = fq0Var.h()) != null) {
            str = strH;
        } else if (str == null) {
            str = "";
        }
        p2xVarN.q(str);
        p2xVarN.t(hrt.e(i));
        p2xVarN.u(d1xVar.c.b());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getKey();
            CharSequence charSequence2 = (CharSequence) entry.getValue();
            mmr0 mmr0Var = charSequence2 == null ? null : new mmr0(charSequence, charSequence2);
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        for (Map.Entry entry2 : sqg0.T(arrayList).entrySet()) {
        }
        p2xVarN.s(new uga0(linkedHashMap).toString());
        d1xVar.a.a(p2xVarN.build());
    }

    @Override // p.tg61
    public final void a() {
        l4p1.u(this.e, x4p1.h(f5p1.q(rqt0.u(new x3s(this.b, (byte) 22)), new nnu(this, (lnm) null, (byte) 16)), new jk((byte) 25)));
    }

    @Override // p.tg61
    public final void end() {
        op71.r(this.e.a);
        this.d = null;
    }
}
