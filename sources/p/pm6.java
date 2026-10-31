package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pm6 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pm6(String str, byte b) {
        super(4);
        this.a = b;
        this.b = str;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        u5j1 u5j1Var = d4o1.a;
        nim0 nim0Var = nim0.a;
        String str = this.b;
        switch (b) {
            case 0:
                im6 im6Var = (im6) obj;
                ((Number) obj3).intValue();
                List list = im6Var.b;
                boolean zIsEmpty = list.isEmpty();
                String str2 = im6Var.a;
                if (zIsEmpty) {
                    return new brl0(str, str2.concat(":dna"), (byte) 8);
                }
                return new brl0(str, gvg.h("spotify:artist:", (String) o7h.A0(ihc1.Q0(str2, new String[]{":"}, 0, 6)), ":dna:blend:", (String) o7h.A0(ihc1.Q0((String) o7h.q0(list), new String[]{":"}, 0, 6))), (byte) 9);
            case 1:
                mnl0 mnl0Var = (mnl0) obj;
                if (((wcg) obj4) == wcg.a) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), mnl0Var.a, mnl0Var.b.c.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 2:
                ((Number) obj3).intValue();
                return new uvk0(str);
            case 3:
                ((Number) obj3).intValue();
                return new rvk0(new uvk0(str));
            case 4:
                ((Number) obj2).intValue();
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(b0kVar).a.c, u5j1Var);
                cvx cvxVar = cbx.b(b0kVar).b;
                qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarF2);
                cvx cvxVar2 = cbx.b(b0kVar).b;
                uwo1.e(this.b, uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 2.0f, 7), cbx.d(b0kVar).h, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2032);
                return rih1Var;
            case 5:
                n8h1 n8h1Var = (n8h1) obj;
                xiv0 xiv0Var = (xiv0) obj3;
                if (((piv0) obj4) == piv0.a) {
                    if (n8h1Var instanceof atk0) {
                        if (xiv0Var.equals(xiv0.a)) {
                            atk0 atk0Var = (atk0) n8h1Var;
                            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                            if (str == null) {
                                str = "";
                            }
                            w7h1Var = new w7h1("", "", z7h1Var, new x7h1("follow", 1, Collections.singletonMap("item_to_be_followed", str)), atk0Var.a, atk0Var.b.b, System.currentTimeMillis());
                        } else {
                            atk0 atk0Var2 = (atk0) n8h1Var;
                            z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                            if (str == null) {
                                str = "";
                            }
                            w7h1Var = new w7h1("", "", z7h1Var2, new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str)), atk0Var2.a, atk0Var2.b.b, System.currentTimeMillis());
                        }
                    } else if (n8h1Var instanceof zsk0) {
                        zsk0 zsk0Var = (zsk0) n8h1Var;
                        z7h1 z7h1Var3 = new z7h1("hit", 1, b7xVar);
                        if (str == null) {
                            str = "";
                        }
                        w7h1Var = new w7h1("", "", z7h1Var3, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), zsk0Var.a, zsk0Var.b.b, System.currentTimeMillis());
                    }
                    return w7h1Var;
                }
                eg.o();
                return null;
            case 6:
                ((Number) obj3).intValue();
                return new ctl0(str, (r6h1) obj4);
            case 7:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 129) != 128)) {
                    qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarF4 = dug.f(qim0VarF3, cbx.a(x340Var2).a.c, u5j1Var);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    qim0 qim0VarZ2 = uyn1.z(12.0f, 0.0f, 2, qim0VarF4);
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    cvx cvxVar5 = cbx.b(x340Var2).b;
                    uwo1.e(this.b, uyn1.B(qim0VarZ2, 0.0f, 12.0f, 0.0f, 2.0f, 5), cbx.d(x340Var2).h, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                return new i1m0(str, ((w8a1) obj).b);
            default:
                ((Number) obj3).intValue();
                return new kul0(str);
        }
    }
}
