package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.pubsub.esperanto.proto.EsPushedMessage;
import com.spotify.settings.esperanto.proto.SettingsOuterClass;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d7n implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ iu30 c;

    public d7n(vr20 vr20Var, lmy0 lmy0Var, String str, iu30 iu30Var) {
        this.a = (byte) 1;
        this.b = vr20Var;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x014a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        c7n c7nVar;
        kmy0 kmy0Var;
        ct61 ct61Var;
        jt61 ht61Var;
        x2c1 x2c1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object obj2 = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof c7n) {
                    c7nVar = (c7n) lnmVar;
                    int i = c7nVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c7nVar.b = i - Integer.MIN_VALUE;
                    } else {
                        c7nVar = new c7n(this, lnmVar);
                    }
                } else {
                    c7nVar = new c7n(this, lnmVar);
                }
                Object obj3 = c7nVar.a;
                int i2 = c7nVar.b;
                if (i2 == 0) {
                    hm5.M(obj3);
                    Object objInvoke = iu30Var.invoke((SettingsOuterClass.SettingsState) obj);
                    c7nVar.b = 1;
                    return vr20Var.emit(objInvoke, c7nVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                if (lnmVar instanceof kmy0) {
                    kmy0Var = (kmy0) lnmVar;
                    int i3 = kmy0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kmy0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        kmy0Var = new kmy0(this, lnmVar);
                    }
                } else {
                    kmy0Var = new kmy0(this, lnmVar);
                }
                Object obj4 = kmy0Var.a;
                int i4 = kmy0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                EsPushedMessage.PushedMessage pushedMessage = (EsPushedMessage.PushedMessage) obj;
                String key = pushedMessage.p().getKey();
                String strO = pushedMessage.o().o();
                h290 h290VarQ = pushedMessage.q();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
                Iterator it = h290VarQ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((phc) it.next()).t());
                }
                c8r c8rVar = new c8r(key, strO, pushedMessage.n(), arrayList);
                try {
                    Object objInvoke2 = iu30Var.invoke(c8rVar);
                    if (objInvoke2 == null) {
                        Logger.d("Error while transforming pushed message with ident %s", new Object[]{strO});
                    }
                    obj2 = objInvoke2;
                    break;
                } catch (Exception e) {
                    Logger.e(e, "Exception while transforming message for %s", new Object[]{c8rVar.b});
                }
                if (obj2 == null) {
                    return rih1Var;
                }
                kmy0Var.b = 1;
                return vr20Var.emit(obj2, kmy0Var) == d9nVar ? d9nVar : rih1Var;
            case 2:
                if (lnmVar instanceof ct61) {
                    ct61Var = (ct61) lnmVar;
                    int i5 = ct61Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ct61Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        ct61Var = new ct61(this, lnmVar);
                    }
                } else {
                    ct61Var = new ct61(this, lnmVar);
                }
                Object obj5 = ct61Var.a;
                int i6 = ct61Var.b;
                if (i6 == 0) {
                    hm5.M(obj5);
                    it61 it61Var = (jt61) obj;
                    if (it61Var instanceof it61) {
                        ht61Var = (jt61) iu30Var.invoke(it61Var.a);
                    } else if (it61Var instanceof ht61) {
                        ht61Var = new ht61(((ht61) it61Var).a, 0);
                    } else {
                        eg.o();
                    }
                    ct61Var.b = 1;
                    return vr20Var.emit(ht61Var, ct61Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj5);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof x2c1) {
                    x2c1Var = (x2c1) lnmVar;
                    int i7 = x2c1Var.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        x2c1Var.b = i7 - Integer.MIN_VALUE;
                    } else {
                        x2c1Var = new x2c1(this, lnmVar);
                    }
                } else {
                    x2c1Var = new x2c1(this, lnmVar);
                }
                Object obj6 = x2c1Var.a;
                int i8 = x2c1Var.b;
                if (i8 == 0) {
                    hm5.M(obj6);
                    Object objInvoke3 = iu30Var.invoke(obj);
                    x2c1Var.b = 1;
                    return vr20Var.emit(objInvoke3, x2c1Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i8 == 1) {
                    hm5.M(obj6);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ d7n(vr20 vr20Var, iu30 iu30Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = iu30Var;
    }
}
