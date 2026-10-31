package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cma0 implements Function0 {
    public final /* synthetic */ byte a;
    public final dma0 b;
    public final ema0 c;

    public cma0(ema0 ema0Var, dma0 dma0Var) {
        this.a = (byte) 0;
        this.c = ema0Var;
        this.b = dma0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x0160  */
    public final Object invoke() throws i9n {
        String str;
        ic11 e7b0Var;
        byte b = this.a;
        ema0 ema0Var = this.c;
        dma0 dma0Var = this.b;
        switch (b) {
            case 0:
                Class cls = ema0Var.b;
                boolean z = oed1.c;
                List listQ0 = z6x.a;
                if (z) {
                    Metadata annotation = cls.getAnnotation(Metadata.class);
                    u2o1 u2o1VarA = annotation != null ? p2o1.A(annotation) : null;
                    if (u2o1VarA instanceof j6b0) {
                        return Collections.singletonList(((j6b0) u2o1VarA).c);
                    }
                    if (u2o1VarA instanceof l6b0) {
                        return Collections.singletonList(((l6b0) u2o1VarA).c);
                    }
                    if (!(u2o1VarA instanceof k6b0)) {
                        return listQ0;
                    }
                    List list = ((k6b0) u2o1VarA).c;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r7h.W((List) ((dma0) ((kla0) guc.b.q(cls.getClassLoader().loadClass(((String) it.next()).replace('/', '.')))).c.getValue()).c.getValue(), arrayList);
                    }
                    return arrayList;
                }
                mc11 mc11Var = dma0Var.e;
                mma0 mma0Var = dma0.g[1];
                zpi0 zpi0Var = (zpi0) mc11Var.invoke();
                if (zpi0Var instanceof git) {
                    listQ0 = Collections.singletonList(zpi0Var);
                } else if (zpi0Var instanceof zbe) {
                    listQ0 = f46.Q0(((zbe) zpi0Var).c);
                }
                List list2 = listQ0;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    git gitVar = (git) ((zpi0) it2.next());
                    arrayList2.add(eso1.I(gitVar.h, (zjn0) gitVar.b.c, false, 6));
                }
                return arrayList2;
            case 1:
                mc11 mc11Var2 = dma0Var.d;
                mma0 mma0Var2 = dma0.g[0];
                jc11 jc11Var = (jc11) mc11Var2.invoke();
                if (jc11Var != null) {
                    at7 at7Var = jc11Var.b;
                    str = (String) at7Var.h;
                    if (((h6b0) at7Var.c) != h6b0.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return ema0Var.b.getClassLoader().loadClass(str.replace('/', '.'));
            default:
                if (oed1.a) {
                    r9r ala0Var = new ala0(ema0Var, (byte) 1);
                    mc11 mc11Var3 = dma0Var.e;
                    mma0 mma0Var3 = dma0.g[1];
                    Collection<n9r> collectionO = c8o.o((zpi0) mc11Var3.invoke(), null, 3);
                    ArrayList arrayList3 = new ArrayList();
                    for (n9r n9rVar : collectionO) {
                        lft lftVar = n9rVar instanceof jyc ? (lft) n9rVar.r(ala0Var, rih1.a) : null;
                        if (lftVar != null) {
                            arrayList3.add(lftVar);
                        }
                    }
                    return o7h.l1(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (v3b0 v3b0Var : (List) dma0Var.c.getValue()) {
                    for (w3b0 w3b0Var : v3b0Var.b) {
                        String str2 = w3b0Var.b;
                        byte b2 = w3b0Var.h.isEmpty() ? w3b0Var.f != null ? (byte) 1 : (byte) 0 : (byte) -1;
                        String strT = ajo1.t(w3b0Var, ema0Var);
                        if (strT == null) {
                            throw new i9n(l1d.m("No field or getter signature for property: ", str2));
                        }
                        Object obj = lyc.NO_RECEIVER;
                        if (xm7.d(w3b0Var)) {
                            if (b2 == -1) {
                                e7b0Var = new e7b0(ema0Var, strT, obj, w3b0Var);
                            } else if (b2 == 0) {
                                e7b0Var = new a7b0(ema0Var, strT, obj, w3b0Var);
                            } else if (b2 != 1) {
                                e7b0Var = null;
                            } else {
                                e7b0Var = new c7b0(ema0Var, strT, obj, w3b0Var);
                            }
                        } else if (b2 == -1) {
                            e7b0Var = new w7b0(ema0Var, strT, obj, w3b0Var);
                        } else if (b2 == 0) {
                            e7b0Var = new q7b0(ema0Var, strT, obj, w3b0Var);
                        } else if (b2 != 1) {
                            e7b0Var = null;
                        } else {
                            e7b0Var = new t7b0(ema0Var, strT, obj, w3b0Var);
                        }
                        if (e7b0Var == null) {
                            StringBuilder sbN = gvg.n("Unsupported property: name=", str2, " signature=", strT, " container=");
                            sbN.append(ema0Var);
                            throw new i9n(sbN.toString());
                        }
                        arrayList4.add(e7b0Var);
                    }
                    for (u3b0 u3b0Var : v3b0Var.a) {
                        ija0 ija0Var = ((yia0) ulo1.q(u3b0Var.k, yia0.b)).a;
                        if (ija0Var == null) {
                            tw20.x(u3b0Var.b, "No signature for function: ");
                            return null;
                        }
                        arrayList4.add(new g7b0(ema0Var, ija0Var.toString(), lyc.NO_RECEIVER, u3b0Var));
                    }
                }
                return o7h.l1(arrayList4);
        }
    }

    public /* synthetic */ cma0(dma0 dma0Var, ema0 ema0Var, byte b) {
        this.a = b;
        this.b = dma0Var;
        this.c = ema0Var;
    }
}
