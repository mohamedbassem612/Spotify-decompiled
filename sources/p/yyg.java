package p;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.spotify.support.assertion.Assertion;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yyg extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyg(tm tmVar, ven0 ven0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 0;
        this.d = tmVar;
        this.e = ven0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                yyg yygVar = new yyg((tm) this.d, (ven0) obj5, (lnm) obj4);
                yygVar.c = (wyg) obj2;
                return yygVar.invokeSuspend(rih1Var);
            case 1:
                yyg yygVar2 = new yyg((xpw) obj5, (lnm) obj4, (byte) 1);
                yygVar2.c = (xs90) obj2;
                yygVar2.d = (tqw) obj3;
                return yygVar2.invokeSuspend(rih1Var);
            case 2:
                yyg yygVar3 = new yyg((xpw) obj5, (lnm) obj4, (byte) 2);
                yygVar3.c = (xaj0) obj2;
                yygVar3.d = (tqw) obj3;
                return yygVar3.invokeSuspend(rih1Var);
            case 3:
                yyg yygVar4 = new yyg((xpw) obj5, (lnm) obj4, (byte) 3);
                yygVar4.c = (dwv0) obj2;
                yygVar4.d = (tqw) obj3;
                return yygVar4.invokeSuspend(rih1Var);
            default:
                yyg yygVar5 = new yyg((xpw) obj5, (lnm) obj4, (byte) 4);
                yygVar5.c = (s261) obj2;
                yygVar5.d = (tqw) obj3;
                return yygVar5.invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.support.assertion.Assertion$RecoverableAssertionError */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    public final Object invokeSuspend(Object obj) throws Assertion.RecoverableAssertionError {
        ou80 ou80Var;
        Object objJ;
        String strH;
        r35 r35Var;
        Context context;
        a6j0 a6j0Var;
        String str;
        String str2;
        String str3;
        ou80 ou80Var2;
        byte b = this.a;
        byte b2 = 16;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        Intent intent = null;
        switch (b) {
            case 0:
                oud oudVar = (oud) ((tm) this.d).d;
                wyg wygVar = (wyg) this.c;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    if (!(wygVar instanceof wyg)) {
                        return rih1Var;
                    }
                    ven0 ven0Var = (ven0) obj2;
                    xyg xygVar = (xyg) ven0Var.getValue();
                    boolean z = wygVar.a;
                    ven0Var.setValue(new xyg(xygVar.a, xygVar.b, new q1f1(new syg(z))));
                    dud dudVar = new dud(new bd90(z));
                    this.c = wygVar;
                    this.b = (byte) 1;
                    if (oudVar.a(dudVar, this) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                hud hudVar = new hud(new on71(new syg(wygVar.a), new rn71(rc11.a.b(vyg.class))));
                this.c = null;
                this.b = (byte) 2;
                if (oudVar.a(hudVar, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                et90 et90Var = (et90) obj2;
                ws90 ws90Var = (xs90) this.c;
                tqw tqwVar = (tqw) this.d;
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    if (ws90Var instanceof us90) {
                        z5a0 z5a0Var = (z5a0) et90Var.d;
                        String str4 = (tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        if (z5a0Var.a(str4, true, this) != d9nVar) {
                            return rih1Var;
                        }
                    } else {
                        if (ws90Var instanceof vs90) {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new Assertion.RecoverableAssertionError("JamInviteNearbyRowLinkButtonElement should never be created on a device that doesn't support Bluetooth.", (String) null);
                            }
                            Activity activity = (Activity) et90Var.e;
                            BluetoothAdapter adapter = ((BluetoothManager) activity.getSystemService(BluetoothManager.class)).getAdapter();
                            if (adapter != null && !adapter.isEnabled()) {
                                intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                            }
                            if (intent == null) {
                                return rih1Var;
                            }
                            activity.startActivity(intent);
                            return rih1Var;
                        }
                        if (ws90Var instanceof ws90) {
                            Context context2 = ws90Var.a;
                            this.c = null;
                            this.d = null;
                            this.b = (byte) 2;
                            v4o0 v4o0Var = (v4o0) et90Var.c;
                            v0o0 v0o0Var = v0o0.a;
                            Object objB = v4o0Var.b(new n4o0(l0o0.a, w0o1.s(v0o0Var, context2, false), w0o1.t(v0o0Var, context2, false)), this);
                            if (objB != d9nVar) {
                                objB = rih1Var;
                            }
                            if (objB != d9nVar) {
                                return rih1Var;
                            }
                        } else {
                            eg.o();
                        }
                    }
                    return d9nVar;
                }
                if (b4 == 1 || b4 == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                f1n0 f1n0Var = ((ud1) obj2).b;
                xaj0 xaj0Var = (xaj0) this.c;
                tqw tqwVar2 = (tqw) this.d;
                byte b5 = this.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    int iOrdinal = xaj0Var.ordinal();
                    if (iOrdinal == 0) {
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        if (f1n0Var.a(this) != d9nVar) {
                            return rih1Var;
                        }
                    } else if (iOrdinal != 1) {
                        eg.o();
                    } else {
                        if (tqwVar2 == null) {
                            return rih1Var;
                        }
                        tv80 tv80VarY = n3o1.y(tqwVar2);
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        if (f1n0.f(f1n0Var, "spotify:premium-destination", tv80VarY, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                    return d9nVar;
                }
                if (b5 == 1 || b5 == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                yup0 yup0Var = (yup0) obj2;
                dwv0 dwv0Var = (dwv0) this.c;
                tqw tqwVar3 = (tqw) this.d;
                byte b6 = this.b;
                if (b6 == 0) {
                    hm5.M(obj);
                    if (u890.j(dwv0Var, cwv0.a) || u890.j(dwv0Var, bwv0.a)) {
                        if (tqwVar3 == null) {
                            return rih1Var;
                        }
                        tv80 tv80VarY2 = n3o1.y(tqwVar3);
                        xvv0 xvv0Var = (xvv0) yup0Var.c;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 1;
                        Object objY = fn31.Y(xvv0Var.c, new cqu0(xvv0Var, tv80VarY2, (lnm) null, (byte) 6), this);
                        if (objY != d9nVar) {
                            objY = rih1Var;
                        }
                        if (objY != d9nVar) {
                            return rih1Var;
                        }
                    } else if (u890.j(dwv0Var, awv0.a)) {
                        pyh1 pyh1Var = (pyh1) yup0Var.d;
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        Object objY2 = fn31.Y(pyh1Var.b, new vbc1(pyh1Var, intent, b2), this);
                        if (objY2 != d9nVar) {
                            objY2 = rih1Var;
                        }
                        if (objY2 != d9nVar) {
                            return rih1Var;
                        }
                    } else {
                        eg.o();
                    }
                    return d9nVar;
                }
                if (b6 == 1 || b6 == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                res resVar = (res) obj2;
                s261 s261Var = (s261) this.c;
                tqw tqwVar4 = (tqw) this.d;
                byte b7 = this.b;
                if (b7 == 0) {
                    hm5.M(obj);
                    if (!u890.j(s261Var, s261.a)) {
                        eg.o();
                        return null;
                    }
                    Flowable flowable = (Flowable) resVar.f;
                    vbm[] vbmVarArr = q601.a;
                    wzv0 wzv0Var = new wzv0(new h801(new kge(flowable), (byte) 2), (byte) 16);
                    ck01 ck01Var = new ck01(2, (lnm) null, (byte) 12);
                    this.c = null;
                    this.d = tqwVar4;
                    this.b = (byte) 1;
                    objJ = b5p1.j(wzv0Var, ck01Var, this);
                    if (objJ != d9nVar) {
                        Set set = s4b1.f;
                        strH = pcf.h(uic.C((String) objJ, (String) null));
                        if (strH != null) {
                            return rih1Var;
                        }
                        r35Var = (r35) resVar.e;
                        context = (Context) resVar.d;
                        a6j0Var = new a6j0(strH, context.getString(2131961612), null, null, null, Collections.singletonMap("feature", "campfire_invite"), null, 92);
                        str = (String) resVar.g;
                        str2 = (String) resVar.h;
                        if (tqwVar4 != null) {
                            str3 = null;
                        } else {
                            str3 = null;
                        }
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 2;
                        if (r35Var.a(context, a6j0Var, str, str2, "android-libs-inappmessaging", str3, this) != d9nVar) {
                            return rih1Var;
                        }
                    }
                } else {
                    if (b7 != 1) {
                        if (b7 == 2) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objJ = obj;
                    Set set2 = s4b1.f;
                    strH = pcf.h(uic.C((String) objJ, (String) null));
                    if (strH != null) {
                        return rih1Var;
                    }
                    r35Var = (r35) resVar.e;
                    context = (Context) resVar.d;
                    a6j0Var = new a6j0(strH, context.getString(2131961612), null, null, null, Collections.singletonMap("feature", "campfire_invite"), null, 92);
                    str = (String) resVar.g;
                    str2 = (String) resVar.h;
                    if (tqwVar4 != null || (ou80Var2 = n3o1.y(tqwVar4).a) == null) {
                        str3 = null;
                    } else {
                        str3 = ou80Var2.a;
                    }
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    if (r35Var.a(context, a6j0Var, str, str2, "android-libs-inappmessaging", str3, this) != d9nVar) {
                        return rih1Var;
                    }
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yyg(xpw xpwVar, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = xpwVar;
    }
}
