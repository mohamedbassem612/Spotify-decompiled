package p;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class gha0 extends z6 {
    public final uga0 f;
    public final h661 g;
    public int h;
    public boolean i;

    public /* synthetic */ gha0(nfa0 nfa0Var, uga0 uga0Var, String str, int i) {
        this(nfa0Var, uga0Var, (i & 4) != 0 ? null : str, (h661) null);
    }

    @Override // p.z6
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public uga0 G() {
        return this.f;
    }

    public final boolean R(h661 h661Var, int i) {
        boolean z = (this.c.a.f || h661Var.i(i) || !h661Var.g(i).b()) ? false : true;
        this.i = z;
        return z;
    }

    @Override // p.z6
    public final boolean X() {
        return !this.i && super.X();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    @Override // p.z6
    public void a(h661 h661Var) throws SerializationException {
        Set setY0;
        nfa0 nfa0Var = this.c;
        if (mue1.J(nfa0Var, h661Var) || (h661Var.getKind() instanceof scv0)) {
            return;
        }
        mue1.P(nfa0Var, h661Var);
        if (this.e.k) {
            Set setP = j0o1.p(h661Var);
            Map map = (Map) ((ConcurrentHashMap) nfa0Var.c.b).get(h661Var);
            Object obj = map != null ? map.get(mue1.a) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = w7x.a;
            }
            setY0 = dm61.y0(setP, setKeySet);
        } else {
            setY0 = j0o1.p(h661Var);
        }
        for (String str : G().a.keySet()) {
            if (!setY0.contains(str) && !u890.j(str, this.d)) {
                throw new JsonDecodingException(vvm1.w(-1, cy30.n("Encountered an unknown key '", str, '\''), J(), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", nfa0Var.a.m ? vvm1.C(-1, G().toString()).toString() : null));
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    @Override // p.z6
    public final x1k b(h661 h661Var) throws SerializationException {
        h661 h661Var2 = this.g;
        if (h661Var != h661Var2) {
            return super.b(h661Var);
        }
        uga0 uga0VarG = g();
        String strH = h661Var2.h();
        boolean z = uga0VarG instanceof uga0;
        nfa0 nfa0Var = this.c;
        if (z) {
            return new gha0(nfa0Var, uga0VarG, this.d, h661Var2);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        jd11 jd11Var = rc11.a;
        sb.append(jd11Var.b(uga0.class).r());
        sb.append(", but had ");
        sb.append(jd11Var.b(uga0VarG.getClass()).r());
        throw new JsonDecodingException(vvm1.w(-1, l1d.n(" as the serialized body of ", strH, sb), J(), (String) null, nfa0Var.a.m ? vvm1.C(-1, uga0VarG.toString()).toString() : null));
    }

    @Override // p.z6
    public ega0 e(String str) {
        return (ega0) sqg0.G(str, G());
    }

    public int p(h661 h661Var) {
        while (this.h < h661Var.d()) {
            int i = this.h;
            this.h = i + 1;
            String strE = E(h661Var, i);
            int i2 = this.h - 1;
            this.i = false;
            if (G().containsKey(strE) || R(h661Var, i2)) {
                if (this.e.h) {
                    boolean zI = h661Var.i(i2);
                    h661 h661VarG = h661Var.g(i2);
                    if (!zI || h661VarG.b() || !(((ega0) G().get(strE)) instanceof rga0)) {
                        if (u890.j(h661VarG.getKind(), l661.h) && (!h661VarG.b() || !(((ega0) G().get(strE)) instanceof rga0))) {
                            ega0 ega0Var = (ega0) G().get(strE);
                            aha0 aha0Var = ega0Var instanceof aha0 ? (aha0) ega0Var : null;
                            String strG = aha0Var != null ? fga0.g(aha0Var) : null;
                            if (strG != null) {
                                nfa0 nfa0Var = this.c;
                                int iE = mue1.E(h661VarG, nfa0Var, strG);
                                boolean z = !nfa0Var.a.f && h661VarG.b();
                                if (iE != -3 || ((!zI && !z) || R(h661Var, i2))) {
                                }
                            }
                        }
                    }
                }
                return i2;
            }
        }
        return -1;
    }

    @Override // p.z6
    public String z(h661 h661Var, int i) {
        nfa0 nfa0Var = this.c;
        mue1.P(nfa0Var, h661Var);
        String strE = h661Var.e(i);
        if (this.e.k && !G().a.keySet().contains(strE)) {
            l7m0 l7m0Var = nfa0Var.c;
            qga0 qga0Var = new qga0(h661Var, nfa0Var, (byte) 0);
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) l7m0Var.b;
            Map map = (Map) concurrentHashMap.get(h661Var);
            Object obj = null;
            khc khcVar = mue1.a;
            Object objInvoke = map != null ? map.get(khcVar) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = qga0Var.invoke();
                Object objM = concurrentHashMap.get(h661Var);
                if (objM == null) {
                    objM = ppo1.m(2);
                    concurrentHashMap.put(h661Var, objM);
                }
                ((Map) objM).put(khcVar, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            for (Object obj2 : G().a.keySet()) {
                Integer num = (Integer) map2.get((String) obj2);
                if (num != null && num.intValue() == i) {
                    obj = obj2;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strE;
    }

    public gha0(nfa0 nfa0Var, uga0 uga0Var, String str, h661 h661Var) {
        super(str, nfa0Var);
        this.f = uga0Var;
        this.g = h661Var;
    }
}
