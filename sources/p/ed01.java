package p;

import com.spotify.corex.reading.proto.ReadSpan;
import com.spotify.corex.reading.proto.Section;
import com.spotify.corex.reading.proto.TextCue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ed01 {
    public static final Set e = f46.S0(new String[]{"spotify.com", "spotify.net"});
    public final ka8 a;
    public final w5b1 b;
    public final q8n c;
    public final q8n d;

    public ed01(ka8 ka8Var, w5b1 w5b1Var, q8n q8nVar, q8n q8nVar2) {
        this.a = ka8Var;
        this.b = w5b1Var;
        this.c = q8nVar;
        this.d = q8nVar2;
    }

    public static sb01 d(ReadSpan readSpan) {
        flb iheVar;
        String uri = readSpan.getUri();
        String strR = readSpan.r();
        h290<Section> h290VarP = readSpan.p();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
        for (Section section : h290VarP) {
            long jP = section.p();
            int iN = section.n();
            int i = iN == 0 ? -1 : ad01.a[l1d.C(iN)];
            if (i != 1) {
                iheVar = por0.a;
                if (i != 2 && i == 3) {
                    String strP = section.q().o().p();
                    if (strP == null) {
                        strP = "";
                    }
                    h290<TextCue> h290VarN = section.q().o().n();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                    for (TextCue textCue : h290VarN) {
                        arrayList2.add(new v3e1(textCue.o(), textCue.n()));
                    }
                    iheVar = new qde1(strP, arrayList2);
                }
            } else {
                iheVar = new ihe(section.o().getTitle());
            }
            arrayList.add(new rf51(jP, iheVar));
        }
        return new sb01(uri, strR, arrayList, new xex0(Integer.valueOf(readSpan.o().o()), readSpan.o().p()), new qqe1(readSpan.s().r(), readSpan.s().p(), readSpan.s().o(), readSpan.s().q()), new glr0(readSpan.n().o(), readSpan.n().p()), readSpan.getName(), readSpan.q());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        bd01 bd01Var;
        if (onmVar instanceof bd01) {
            bd01Var = (bd01) onmVar;
            int i = bd01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bd01Var.c = i - Integer.MIN_VALUE;
            } else {
                bd01Var = new bd01(this, onmVar);
            }
        } else {
            bd01Var = new bd01(this, onmVar);
        }
        Object objB = bd01Var.a;
        int i2 = bd01Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            Set set = s4b1.f;
            String strJ = uic.x(str).j();
            if (strJ == null) {
                hhg1.n(l1d.m("Invalid audiobook URI: ", str));
                return null;
            }
            bd01Var.c = 1;
            objB = this.a.b(strJ, null, bd01Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        ReadSpan readSpan = (ReadSpan) ((sy21) objB).b;
        if (readSpan != null) {
            return d(readSpan);
        }
        k220.i("Empty response body");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, onm onmVar) {
        cd01 cd01Var;
        if (onmVar instanceof cd01) {
            cd01Var = (cd01) onmVar;
            int i = cd01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cd01Var.c = i - Integer.MIN_VALUE;
            } else {
                cd01Var = new cd01(this, onmVar);
            }
        } else {
            cd01Var = new cd01(this, onmVar);
        }
        Object objA = cd01Var.a;
        int i2 = cd01Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            Set set = s4b1.f;
            String strJ = uic.x(str).j();
            if (strJ == null) {
                hhg1.n(l1d.m("Invalid audiobook URI: ", str));
                return null;
            }
            String strJ2 = uic.x(str2).j();
            if (strJ2 == null) {
                hhg1.n(l1d.m("Invalid chapter URI: ", str2));
                return null;
            }
            cd01Var.c = 1;
            objA = this.a.a(strJ, strJ2, cd01Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        ReadSpan readSpan = (ReadSpan) ((sy21) objA).b;
        if (readSpan != null) {
            return d(readSpan);
        }
        k220.i("Empty response body");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        dd01 dd01Var;
        String str2;
        if (onmVar instanceof dd01) {
            dd01Var = (dd01) onmVar;
            int i = dd01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dd01Var.c = i - Integer.MIN_VALUE;
            } else {
                dd01Var = new dd01(this, onmVar);
            }
        } else {
            dd01Var = new dd01(this, onmVar);
        }
        Object objY = dd01Var.a;
        int i2 = dd01Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            k370 k370Var = new k370();
            k370Var.f((l370) null, str);
            l370 l370VarB = k370Var.b();
            String str3 = l370VarB.d;
            if (u890.j(l370VarB.a, "https")) {
                Set set = e;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    do {
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            if (u890.j(str3, str2)) {
                                break;
                            }
                        }
                    } while (!nhc1.R(str3, "." + str2, false));
                    ne neVar = new ne((byte) 9);
                    neVar.t();
                    neVar.a = l370VarB;
                    p2z0 p2z0Var = new p2z0(this, new ln21(neVar), (lnm) null, (byte) 10);
                    dd01Var.c = 1;
                    objY = fn31.Y(this.c, p2z0Var, dd01Var);
                    d9n d9nVar = d9n.a;
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            hhg1.f(l1d.m("Refusing to fetch page from untrusted host: ", str3));
            return null;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objY);
        ReadSpan readSpan = (ReadSpan) objY;
        readSpan.getClass();
        return d(readSpan);
    }
}
