package p;

import com.spotify.mobius.MobiusLoop;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w87 implements UnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w87(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object jam1Var;
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        String str = null;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                Set set = (Set) ((AtomicReference) obj3).get();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) obj2).entrySet()) {
                    if (set.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return sqg0.O(map, linkedHashMap);
            case 1:
                pfm1 pfm1Var = (pfm1) obj;
                pfm1Var.getClass();
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                if (str3 != null && !ihc1.y0(str3)) {
                    str = str3;
                }
                return new pfm1(pfm1Var.a, new ofm1(str2, str));
            default:
                MobiusLoop mobiusLoop = (MobiusLoop) obj;
                qfm1 qfm1Var = ((ahm1) obj3).d;
                vgm1 vgm1Var = (vgm1) obj2;
                if (mobiusLoop == null) {
                    eg.m("This loop has already been stopped or has never been started");
                    return null;
                }
                boolean z = vgm1Var instanceof tgm1;
                if (z) {
                    qfm1Var.a.updateAndGet(new v87(((tgm1) vgm1Var).a.getId(), (byte) 5));
                } else if (vgm1Var instanceof lgm1) {
                    lgm1 lgm1Var = (lgm1) vgm1Var;
                    String str4 = lgm1Var.a;
                    sju sjuVar = lgm1Var.c;
                    qfm1Var.a.updateAndGet(new w87(str4, sjuVar != null ? sjuVar.c : null, (byte) 1));
                }
                if (z) {
                    jam1Var = new mam1(((tgm1) vgm1Var).a);
                } else if (vgm1Var instanceof ugm1) {
                    ugm1 ugm1Var = (ugm1) vgm1Var;
                    jam1Var = new nam1(ugm1Var.a, ugm1Var.b);
                } else if (vgm1Var instanceof ogm1) {
                    jam1Var = new gam1(((ogm1) vgm1Var).a);
                } else if (vgm1Var instanceof pgm1) {
                    pgm1 pgm1Var = (pgm1) vgm1Var;
                    jam1Var = new ham1(pgm1Var.a, pgm1Var.b);
                } else if (vgm1Var.equals(ngm1.a)) {
                    jam1Var = eam1.a;
                } else if (vgm1Var.equals(mgm1.a)) {
                    jam1Var = dam1.a;
                } else if (vgm1Var instanceof lgm1) {
                    lgm1 lgm1Var2 = (lgm1) vgm1Var;
                    jam1Var = new cam1(lgm1Var2.a, lgm1Var2.b, lgm1Var2.c);
                } else if (vgm1Var instanceof jgm1) {
                    jam1Var = new aam1(((jgm1) vgm1Var).a);
                } else if (vgm1Var.equals(fgm1.a)) {
                    jam1Var = u9m1.a;
                } else if (vgm1Var instanceof qgm1) {
                    qgm1 qgm1Var = (qgm1) vgm1Var;
                    jam1Var = new jam1(qgm1Var.a, qgm1Var.b);
                } else if (vgm1Var.equals(hgm1.a)) {
                    jam1Var = y9m1.a;
                } else if (vgm1Var.equals(sgm1.a)) {
                    jam1Var = lam1.a;
                } else if (vgm1Var.equals(kgm1.a)) {
                    jam1Var = bam1.a;
                } else if (vgm1Var.equals(igm1.a)) {
                    jam1Var = z9m1.a;
                } else if (vgm1Var.equals(rgm1.a)) {
                    jam1Var = kam1.a;
                } else {
                    if (!vgm1Var.equals(ggm1.a)) {
                        eg.o();
                        return null;
                    }
                    jam1Var = x9m1.a;
                }
                mobiusLoop.a(jam1Var);
                return mobiusLoop;
        }
    }
}
