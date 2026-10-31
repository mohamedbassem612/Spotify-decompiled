package p;

import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sn80 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sn80(Context context, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = context;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Context context = this.c;
        switch (b) {
            case 0:
                return new sn80(context, lnmVar, (byte) 0);
            case 1:
                return new sn80(context, lnmVar, (byte) 1);
            case 2:
                return new sn80(context, lnmVar, (byte) 2);
            case 3:
                return new sn80(context, lnmVar, (byte) 3);
            case 4:
                return new sn80(context, lnmVar, (byte) 4);
            case 5:
                return new sn80(context, lnmVar, (byte) 5);
            case 6:
                return new sn80(context, lnmVar, (byte) 6);
            case 7:
                return new sn80(context, lnmVar, (byte) 7);
            default:
                sn80 sn80Var = new sn80(context, lnmVar, (byte) 8);
                sn80Var.b = ((Boolean) obj).booleanValue();
                return sn80Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((sn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((sn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((sn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((sn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((sn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((sn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((sn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((sn80) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((sn80) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Context context = this.c;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objH = guo1.H(new tn80(context, null), this);
                    return objH == d9nVar ? d9nVar : objH;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY = fn31.Y(igu.a, new sn80(context, lnmVar, (byte) 6), this);
                    return objY == d9nVar ? d9nVar : objY;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY2 = fn31.Y(igu.a, new vn80(context, (lnm) null), this);
                    return objY2 == d9nVar ? d9nVar : objY2;
                }
                if (z3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY3 = fn31.Y(igu.a, new p82(context, null, (byte) 3), this);
                    return objY3 == d9nVar ? d9nVar : objY3;
                }
                if (z4) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY4 = fn31.Y(igu.a, new xn80(context, (lnm) null), this);
                    return objY4 == d9nVar ? d9nVar : objY4;
                }
                if (z5) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    Object objY5 = fn31.Y(igu.a, new zn80(context, (lnm) null), this);
                    return objY5 == d9nVar ? d9nVar : objY5;
                }
                if (z6) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        ayh ayhVarA = sap1.a();
                        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context.getApplicationContext()).build();
                        installReferrerClientBuild.startConnection(new ro30(ayhVarA, installReferrerClientBuild, (byte) 24));
                        this.b = true;
                        obj = ayhVarA.Q(this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return (qn80) obj;
                } catch (Exception e) {
                    i1k0.C("Caught getGooglePlayStoreReferrerDetails exception: " + e);
                }
                break;
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                at40 at40Var = new at40(context);
                this.b = true;
                String packageName = context.getPackageName();
                List<AppWidgetProviderInfo> installedProviders = at40Var.b.getInstalledProviders();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : installedProviders) {
                    if (u890.j(((AppWidgetProviderInfo) obj2).provider.getPackageName(), packageName)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
                }
                Object objA = ((r4r) at40Var.c.getValue()).a(new zs40(o7h.p1(arrayList2), null, (byte) 0), this);
                if (objA != d9nVar) {
                    objA = rih1Var;
                }
                return objA == d9nVar ? d9nVar : rih1Var;
            default:
                hm5.M(obj);
                jzq0.a(context, RescheduleReceiver.class, this.b);
                return rih1Var;
        }
    }
}
