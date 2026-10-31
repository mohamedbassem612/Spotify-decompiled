package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z290 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z290(boolean z, Function0 function0, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 24;
        this.b = z;
        this.c = function0;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj) throws NoWhenBranchMatchedException {
        rih1 m231Var;
        rih1 rih1Var;
        boolean z = this.b;
        try {
            if (!z) {
                hm5.M(obj);
                xyc0 xyc0Var = ((tji0) this.c).b;
                String str = (String) this.d;
                List listSingletonList = Collections.singletonList(new ayc0("toggle-membership-badge", (phc) this.e, (phc) this.f, false, (String) null, 24));
                List listSingletonList2 = Collections.singletonList("membership-badge");
                this.b = true;
                obj = xyc0Var.s(str, listSingletonList, listSingletonList2, this);
                d9n d9nVar = d9n.a;
                if (obj == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            ly21 ly21Var = (py21) obj;
            if (ly21Var instanceof oy21) {
                rih1Var = rih1.a;
            } else {
                if (!(ly21Var instanceof ly21)) {
                    throw new NoWhenBranchMatchedException();
                }
                m231Var = new m231(new IllegalStateException(ly21Var.a.b()));
                rih1Var = m231Var;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m231Var = new m231(e2);
        }
        return new e331(rih1Var);
    }

    private final Object g(Object obj) {
        z290 z290Var;
        Exception exc;
        boolean z = this.b;
        try {
            if (!z) {
                hm5.M(obj);
                try {
                    wmy wmyVar = (wmy) this.c;
                    r35 r35Var = (r35) wmyVar.c;
                    dg30 dg30Var = (dg30) wmyVar.b;
                    try {
                        a6j0 a6j0Var = new a6j0((String) this.d, dg30Var.getString(2131960553), (String) null, (String) null, (dqi1) null, sqg0.J(new mmr0[]{new mmr0("feature", "campfire_invite"), new mmr0("new_message_invite", LocalFilesProperties$TestHelper.TRUE)}), (o371) null, 92);
                        String str = (String) this.e;
                        this.b = true;
                        z290Var = this;
                        try {
                            Object objA = r35Var.a(dg30Var, a6j0Var, "profile", str, "chat-invite-link", (String) null, z290Var);
                            d9n d9nVar = d9n.a;
                            if (objA == d9nVar) {
                                return d9nVar;
                            }
                        } catch (Exception e) {
                            e = e;
                            exc = e;
                            Logger.e(exc, l1d.m("Failed to open invite share sheet for ", (String) z290Var.f), new Object[0]);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z290Var = this;
                    }
                } catch (Exception e3) {
                    z290Var = this;
                    exc = e3;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    hm5.M(obj);
                } catch (Exception e4) {
                    exc = e4;
                    z290Var = this;
                    Logger.e(exc, l1d.m("Failed to open invite share sheet for ", (String) z290Var.f), new Object[0]);
                }
            }
            return rih1.a;
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                return new z290((ur00) this.d, (e490) obj2, (tv80) obj3, lnmVar, (byte) 0);
            case 1:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 1);
            case 2:
                z290 z290Var = new z290((t0a0) this.d, (pp90) obj2, (String) obj3, lnmVar, (byte) 2);
                z290Var.c = obj;
                return z290Var;
            case 3:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 3);
            case 4:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 4);
            case 5:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 5);
            case 6:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 6);
            case 7:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 7);
            case 8:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 8);
            case 9:
                z290 z290Var2 = new z290(obj2, obj3, lnmVar, (byte) 9);
                z290Var2.d = obj;
                return z290Var2;
            case 10:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 10);
            case 11:
                z290 z290Var3 = new z290((ywc0) this.d, (hti0) obj2, (rzq) obj3, lnmVar, (byte) 11);
                z290Var3.c = obj;
                return z290Var3;
            case 12:
                return new z290((wls0) this.d, (String) obj2, (xyc0) obj3, lnmVar, (byte) 12);
            case 13:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 13);
            case 14:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 14);
            case 15:
                z290 z290Var4 = new z290((lt20) this.d, lnmVar, (p811) obj2, (Consumer) obj3);
                z290Var4.c = obj;
                return z290Var4;
            case 16:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 16);
            case 17:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 17);
            case 18:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 18);
            case 19:
                z290 z290Var5 = new z290(obj2, obj3, lnmVar, (byte) 19);
                z290Var5.d = obj;
                return z290Var5;
            case 20:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 20);
            case 21:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 21);
            case 22:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 22);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new z290((ezg0) this.d, (iu30) obj2, (ven0) obj3, lnmVar, (byte) 23);
            case 24:
                return new z290(this.b, (Function0) this.c, (ven0) this.d, (ven0) obj2, (ven0) obj3, lnmVar);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 25);
            case 26:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 26);
            case 27:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 27);
            case 28:
                return new z290(this.c, this.d, obj2, obj3, lnmVar, (byte) 28);
            default:
                return new z290(this.c, this.d, this.e, obj3, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01a4 -> B:64:0x01a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z290.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z290(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z290(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z290(lt20 lt20Var, lnm lnmVar, p811 p811Var, Consumer consumer) {
        super(2, lnmVar);
        this.a = (byte) 15;
        this.d = lt20Var;
        this.e = p811Var;
        this.f = consumer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z290(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
