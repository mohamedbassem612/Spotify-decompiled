package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class kd11 extends jd11 {
    public static mla0 n(lyc lycVar) {
        kla0 owner = lycVar.getOwner();
        return owner instanceof mla0 ? (mla0) owner : m6x.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    @Override // p.jd11
    public final nla0 a(sv30 sv30Var) throws i9n {
        ema0 ema0VarN = n(sv30Var);
        String name = sv30Var.getName();
        String signature = sv30Var.getSignature();
        if (!oed1.c()) {
            if (name.equals("<init>")) {
                if ((ema0VarN instanceof bla0) && ((bla0) ema0VarN).b.getAnnotation(Metadata.class) != null) {
                    Collection collectionC = ema0VarN.C();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionC) {
                        if (String.valueOf(hon1.t((p3b0) obj)).equals(signature)) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() == 1) {
                        return new w6b0(ema0VarN, signature, sv30Var.getBoundReceiver(), (p3b0) o7h.V0(arrayList));
                    }
                    String strY0 = o7h.y0(ema0VarN.C(), "\n", null, null, aht.X0, 30);
                    StringBuilder sb = new StringBuilder("Constructor (JVM signature: ");
                    sb.append(signature);
                    sb.append(") not resolved in ");
                    sb.append(ema0VarN);
                    sb.append(':');
                    sb.append(strY0.length() == 0 ? " no constructors found" : " several matching constructors found:\n".concat(strY0));
                    throw new i9n(sb.toString());
                }
            } else if (ema0VarN instanceof ema0) {
                ema0 ema0Var = ema0VarN;
                ArrayList arrayListL = ema0Var.L();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListL) {
                    u3b0 u3b0Var = (u3b0) obj2;
                    if (u890.j(u3b0Var.a(), name) && String.valueOf(hon1.u(u3b0Var)).equals(signature)) {
                        arrayList2.add(obj2);
                    }
                }
                if (arrayList2.size() == 1) {
                    return new g7b0(ema0VarN, signature, sv30Var.getBoundReceiver(), (u3b0) o7h.V0(arrayList2));
                }
                String strY1 = o7h.y0(ema0Var.L(), "\n", null, null, aht.V0, 30);
                StringBuilder sbN = gvg.n("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbN.append(ema0VarN);
                sbN.append(':');
                sbN.append(strY1.length() == 0 ? " no members found" : " several matching members found:\n".concat(strY1));
                throw new i9n(sbN.toString());
            }
        }
        return new nft(ema0VarN, name, signature, sv30Var.getBoundReceiver());
    }

    @Override // p.jd11
    public final tka0 b(Class cls) {
        return (bla0) guc.a.q(cls);
    }

    @Override // p.jd11
    public final kla0 c(Class cls) {
        return (kla0) guc.b.q(cls);
    }

    @Override // p.jd11
    public final oma0 d(oma0 oma0Var) {
        return uyn1.o(oma0Var);
    }

    @Override // p.jd11
    public final vla0 e(den0 den0Var) {
        mla0 mla0VarN = n(den0Var);
        String signature = den0Var.getSignature();
        return !oed1.c() ? new erb0(new gfr(signature, mla0VarN, den0Var, (byte) 13)) : new pft(mla0VarN, den0Var.getName(), signature, den0Var.getBoundReceiver());
    }

    @Override // p.jd11
    public final xla0 f(een0 een0Var) {
        mla0 mla0VarN = n(een0Var);
        String signature = een0Var.getSignature();
        return !oed1.c() ? new frb0(new gfr(mla0VarN, een0Var, signature, (byte) 15)) : new rft(mla0VarN, een0Var.getName(), signature, een0Var.getBoundReceiver());
    }

    @Override // p.jd11
    public final yla0 g(fen0 fen0Var) {
        return new tft(n(fen0Var), fen0Var.getName(), fen0Var.getSignature());
    }

    @Override // p.jd11
    public final ima0 h(bey0 bey0Var) {
        mla0 mla0VarN = n(bey0Var);
        String signature = bey0Var.getSignature();
        return !oed1.c() ? new grb0(new gfr(signature, mla0VarN, bey0Var, (byte) 12)) : new ggt(mla0VarN, bey0Var.getName(), signature, bey0Var.getBoundReceiver());
    }

    @Override // p.jd11
    public final kma0 i(cey0 cey0Var) {
        mla0 mla0VarN = n(cey0Var);
        String signature = cey0Var.getSignature();
        return !oed1.c() ? new hrb0(new gfr(mla0VarN, cey0Var, signature, (byte) 14)) : new jgt(mla0VarN, cey0Var.getName(), signature, cey0Var.getBoundReceiver());
    }

    @Override // p.jd11
    public final lma0 j(dey0 dey0Var) {
        return new lgt(n(dey0Var), dey0Var.getName(), dey0Var.getSignature());
    }

    @Override // p.jd11
    public final String k(jv30 jv30Var) {
        nft nftVarV = x1p1.v(jv30Var);
        return nftVarV != null ? f4x0.o(nftVarV) : super.k(jv30Var);
    }

    @Override // p.jd11
    public final String l(hab0 hab0Var) {
        return k(hab0Var);
    }

    @Override // p.jd11
    public final oma0 m(tka0 tka0Var, List list, boolean z) {
        if (!(tka0Var instanceof wdg)) {
            return anm1.v(tka0Var, list, z, Collections.EMPTY_LIST, (tka0) null);
        }
        Class clsN = ((wdg) tka0Var).n();
        rm5 rm5Var = guc.a;
        if (list.isEmpty()) {
            return z ? (oma0) guc.d.q(clsN) : (oma0) guc.c.q(clsN);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) guc.e.q(clsN);
        mmr0 mmr0VarN = oqn1.n(list, Boolean.valueOf(z));
        Object obj = concurrentHashMap.get(mmr0VarN);
        if (obj == null) {
            b7 b7VarV = anm1.v((bla0) guc.a.q(clsN), list, z, z6x.a, (tka0) null);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(mmr0VarN, b7VarV);
            obj = objPutIfAbsent == null ? b7VarV : objPutIfAbsent;
        }
        return (oma0) obj;
    }
}
