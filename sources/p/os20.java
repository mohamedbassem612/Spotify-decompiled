package p;

import android.view.MotionEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class os20 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ os20(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                os20 os20Var = new os20((l811) obj3, (iu30) obj2, lnmVar, (byte) 0);
                os20Var.b = obj;
                return os20Var;
            case 1:
                return new os20((vu30) this.b, (h0r0) obj3, (c7r0) obj2, lnmVar, (byte) 1);
            case 2:
                return new os20((u601) this.b, (a4f0) obj3, (ci01) obj2, lnmVar, (byte) 2);
            case 3:
                os20 os20Var2 = new os20((qzl1) obj3, (n811) obj2, lnmVar, (byte) 3);
                os20Var2.b = obj;
                return os20Var2;
            default:
                return new os20((i25) this.b, (String) obj3, (MotionEvent) obj2, lnmVar, (byte) 4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create(obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            case 3:
                create((hot) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        boolean z;
        bpn1 bpn1Var;
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                hm5.M(obj);
                l811 l811Var = (l811) this.c;
                if (l811Var.a) {
                    ll20.b1.invoke(new e331(obj2));
                } else {
                    ((iu30) this.d).invoke(new e331(obj2));
                    l811Var.a = true;
                }
                return rih1.a;
            case 1:
                hm5.M(obj);
                ((vu30) this.b).invoke((h0r0) this.c, (c7r0) this.d);
                return rih1.a;
            case 2:
                hm5.M(obj);
                op80 op80Var = (op80) ((u601) this.b).getValue();
                auw auwVarI = sap1.i(op80Var);
                if (auwVarI != null) {
                    auwVarI.create().c(100, op80Var, new d4v0((a4f0) this.c, (ci01) this.d, op80Var, (byte) 15));
                }
                return rih1.a;
            case 3:
                fot fotVar = (hot) this.b;
                hm5.M(obj);
                if (fotVar instanceof fot) {
                    qzl1 qzl1Var = (qzl1) this.c;
                    rzl1 rzl1Var = fotVar.a;
                    nzl1 nzl1Var = rzl1Var.a;
                    synchronized (qzl1Var.e) {
                        vam0 vam0Var = qzl1Var.f;
                        z = (vam0Var == null || !vam0Var.a().equals(nzl1Var) || vam0Var.b()) ? false : true;
                    }
                    if (!z && rzl1Var.c) {
                        synchronized (qzl1Var.e) {
                            try {
                                vam0 vam0Var2 = qzl1Var.f;
                                if (!((vam0Var2 == null || !vam0Var2.a().equals(nzl1Var) || vam0Var2.b()) ? false : true)) {
                                    qzl1Var.a(li20.c);
                                    String string = UUID.randomUUID().toString();
                                    try {
                                        PlayerState playerState = qzl1Var.g;
                                        if (playerState == null) {
                                            playerState = rzl1Var.b;
                                        }
                                        vam0 vam0VarA = qzl1Var.c.a(nzl1Var, playerState, string);
                                        vam0VarA.c();
                                        qzl1Var.f = vam0VarA;
                                    } catch (Exception e) {
                                        Logger.e(e, "Failed to create workout session", new Object[0]);
                                        qzl1Var.c.d.p(string);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    break;
                } else if (u890.j(fotVar, eot.a)) {
                    qzl1 qzl1Var2 = (qzl1) this.c;
                    li20 li20Var = li20.c;
                    synchronized (qzl1Var2.e) {
                        qzl1Var2.a(li20Var);
                    }
                } else {
                    if (!u890.j(fotVar, got.a)) {
                        eg.o();
                        return null;
                    }
                    qzl1 qzl1Var3 = (qzl1) this.c;
                    li20 li20Var2 = li20.b;
                    synchronized (qzl1Var3.e) {
                        qzl1Var3.a(li20Var2);
                    }
                }
                ((n811) this.d).a = 0;
                return rih1.a;
            default:
                MotionEvent motionEvent = (MotionEvent) this.d;
                hm5.M(obj);
                try {
                    i25 i25Var = (i25) this.b;
                    if (i25Var.a && (bpn1Var = (bpn1) i25Var.e) != null) {
                        String str = (String) this.c;
                        motionEvent.getClass();
                        bpn1Var.a(str, motionEvent);
                        break;
                    }
                    return rih1.a;
                } finally {
                    motionEvent.recycle();
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ os20(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }
}
