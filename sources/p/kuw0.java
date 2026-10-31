package p;

import android.view.View;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.time.esperanto.proto.EsServerTime;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import j$.util.Base64;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class kuw0 implements Function, np80, c36, Init, c290, k1q0, mdo0, phs0 {
    public final /* synthetic */ byte a;
    public static final kuw0 b = new kuw0((byte) 0);
    public static final kuw0 c = new kuw0((byte) 1);
    public static final kuw0 d = new kuw0((byte) 2);
    public static final kuw0 e = new kuw0((byte) 3);
    public static final kuw0 f = new kuw0((byte) 4);
    public static final kuw0 g = new kuw0((byte) 5);
    public static final kuw0 h = new kuw0((byte) 6);
    public static final kuw0 i = new kuw0((byte) 7);
    public static final kuw0 t = new kuw0((byte) 8);
    public static final kuw0 X = new kuw0((byte) 9);
    public static final /* synthetic */ kuw0 Y = new kuw0((byte) 22);

    public kuw0(cdn cdnVar) {
        this.a = (byte) 12;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public Object apply(Object obj) throws NoWhenBranchMatchedException {
        Object objInvoke;
        switch (this.a) {
            case 0:
                return ((GetValuesResponse) obj).o();
            case 1:
            case 2:
            case 7:
            default:
                return Single.just(z5p1.l());
            case 3:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsServerTime.ServerTime.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.time.esperanto.proto.EsServerTime.ServerTime: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 4:
                List list = (List) obj;
                return oqn1.n(o7h.q0(list), o7h.A0(list));
            case 5:
                oy21 oy21Var = (py21) obj;
                fe91 fe91Var = fe91.N0;
                if (oy21Var instanceof ly21) {
                    objInvoke = z6x.a;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = fe91Var.invoke(oy21Var.a);
                }
                return (List) objInvoke;
            case 6:
                return ((ContextTrack) ((PlayerState) obj).track().b()).uri();
            case 8:
                return new csk1((h06) obj);
        }
    }

    @Override // p.mdo0
    public int b() {
        return 16;
    }

    @Override // p.mdo0
    public void c(hmb0 hmb0Var, long j, gk60 gk60Var, int i2, boolean z) {
        hmb0Var.B(j, gk60Var, i2, z);
    }

    @Override // p.c290
    public Object convert(int i2) {
        hm8 hm8VarA = hm8.a(i2);
        return hm8VarA == null ? hm8.h : hm8VarA;
    }

    @Override // p.phs0
    public /* synthetic */ Object d(p331 p331Var) {
        return ((wen1) p331Var).a();
    }

    @Override // p.c36
    public void e(wat watVar, int i2, int[] iArr, flb0 flb0Var, int[] iArr2) {
        int i3 = 0;
        if (flb0Var == flb0.a) {
            int i4 = 0;
            for (int i5 : iArr) {
                i4 += i5;
            }
            int length = iArr.length;
            int i6 = i2 - i4;
            int i7 = 0;
            while (i3 < length) {
                int i8 = iArr[i3];
                iArr2[i7] = i6;
                i6 += i8;
                i3++;
                i7++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i9 = iArr[length2];
            iArr2[length2] = i3;
            i3 += i9;
        }
    }

    public First e0(Object obj) {
        adn adnVar = (adn) obj;
        adnVar.getClass();
        cqz0 cqz0Var = dqz0.a;
        return pno1.i(adnVar);
    }

    public String f(Method method, int i2) {
        return "parameter #" + (i2 + 1);
    }

    @Override // p.mdo0
    public boolean g(hmb0 hmb0Var) {
        return true;
    }

    public Object h(Class cls, Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean i(Method method) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // p.mdo0
    public boolean l(gk60 gk60Var, hmb0 hmb0Var) {
        ndo0 ndo0Var = (ndo0) hmb0Var.e1.e;
        ndo0Var.getClass();
        pim0 pim0VarM1 = ndo0Var.m1(odo0.g(16));
        if (pim0VarM1 != null && pim0VarM1.N0) {
            if (!pim0VarM1.a.N0) {
                qf80.c("visitLocalDescendants called on an unattached node");
            }
            pim0 pim0Var = pim0VarM1.a;
            if ((pim0Var.d & 16) != 0) {
                while (pim0Var != null) {
                    if ((pim0Var.c & 16) != 0) {
                        ?? E = pim0Var;
                        ?? bfn0Var = 0;
                        while (E != 0) {
                            if (E instanceof mav0) {
                                if (((mav0) E).h1()) {
                                    gk60Var.c = gk60Var.a.b - 1;
                                    return true;
                                }
                            } else if ((E.c & 16) != 0 && (E instanceof l5t)) {
                                pim0 pim0Var2 = ((l5t) E).P0;
                                int i2 = 0;
                                while (pim0Var2 != null) {
                                    if ((pim0Var2.c & 16) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            E = E;
                                            bfn0Var = bfn0Var;
                                            bfn0Var = bfn0Var;
                                            E = pim0Var2;
                                        } else {
                                            if (bfn0Var == 0) {
                                                bfn0Var = new bfn0(0, new pim0[16]);
                                            }
                                            if (E != 0) {
                                                bfn0Var.b(E);
                                                E = 0;
                                            }
                                            bfn0Var.b(pim0Var2);
                                        }
                                    } else {
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    }
                                    pim0Var2 = pim0Var2.f;
                                    E = E;
                                    bfn0Var = bfn0Var;
                                }
                                if (i2 == 1) {
                                    E = E;
                                    bfn0Var = bfn0Var;
                                } else {
                                    E = E;
                                    bfn0Var = bfn0Var;
                                }
                            }
                            E = oap1.e((bfn0) bfn0Var);
                        }
                    }
                    pim0Var = pim0Var.f;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // p.mdo0
    public boolean m(pim0 pim0Var) {
        ?? bfn0Var = 0;
        while (pim0Var != 0) {
            if (pim0Var instanceof mav0) {
                if (((mav0) pim0Var).O()) {
                    return true;
                }
            } else if ((pim0Var.c & 16) != 0 && (pim0Var instanceof l5t)) {
                pim0 pim0Var2 = ((l5t) pim0Var).P0;
                int i2 = 0;
                while (pim0Var2 != null) {
                    if ((pim0Var2.c & 16) != 0) {
                        i2++;
                        if (i2 == 1) {
                            bfn0Var = bfn0Var;
                            pim0Var = pim0Var;
                            bfn0Var = bfn0Var;
                            pim0Var = pim0Var2;
                        } else {
                            if (bfn0Var == 0) {
                                bfn0Var = new bfn0(0, new pim0[16]);
                            }
                            if (pim0Var != 0) {
                                bfn0Var.b(pim0Var);
                                pim0Var = 0;
                            }
                            bfn0Var.b(pim0Var2);
                        }
                    } else {
                        bfn0Var = bfn0Var;
                        pim0Var = pim0Var;
                    }
                    pim0Var2 = pim0Var2.f;
                    bfn0Var = bfn0Var;
                    pim0Var = pim0Var;
                }
                if (i2 == 1) {
                    bfn0Var = bfn0Var;
                    pim0Var = pim0Var;
                } else {
                    bfn0Var = bfn0Var;
                    pim0Var = pim0Var;
                }
            }
            pim0Var = oap1.e((bfn0) bfn0Var);
        }
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return "Arrangement#End";
            default:
                return super.toString();
        }
    }

    @Override // p.k1q0
    public hsl1 x(View view, hsl1 hsl1Var) {
        esl1 esl1Var = hsl1Var.a;
        view.setPadding(esl1Var.i(647).a, esl1Var.i(647).b, esl1Var.i(647).c, esl1Var.i(647).d);
        return hsl1.b;
    }

    public /* synthetic */ kuw0(byte b2) {
        this.a = b2;
    }
}
