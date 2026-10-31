package p;

import android.content.Context;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nya1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pya1 c;
    public final /* synthetic */ SplitInstallSessionState d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nya1(pya1 pya1Var, SplitInstallSessionState splitInstallSessionState, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pya1Var;
        this.d = splitInstallSessionState;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        SplitInstallSessionState splitInstallSessionState = this.d;
        pya1 pya1Var = this.c;
        switch (b) {
            case 0:
                return new nya1(pya1Var, splitInstallSessionState, lnmVar, (byte) 0);
            default:
                return new nya1(pya1Var, splitInstallSessionState, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        lnm lnmVar = null;
        byte b = 1;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    pya1 pya1Var = this.c;
                    SplitInstallSessionState splitInstallSessionState = this.d;
                    this.b = true;
                    Object obj2 = rih1.a;
                    int iStatus = splitInstallSessionState.status();
                    if (iStatus == 0) {
                        o7h.y0(splitInstallSessionState.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                        splitInstallSessionState.totalBytesToDownload();
                    } else if (iStatus == 5) {
                        Object objY = fn31.Y(pya1Var.a, new nya1(pya1Var, splitInstallSessionState, lnmVar, b), this);
                        if (objY == d9nVar) {
                            obj2 = objY;
                        }
                    } else if (iStatus == 6) {
                        o7h.y0(splitInstallSessionState.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                        String.valueOf(splitInstallSessionState.errorCode());
                        splitInstallSessionState.totalBytesToDownload();
                        splitInstallSessionState.bytesDownloaded();
                        int iErrorCode = splitInstallSessionState.errorCode();
                        if (iErrorCode != -6) {
                            if (iErrorCode == -1) {
                                pya1Var.c.getSessionStates().b(new ep31(pya1Var, (byte) 21));
                            }
                        } else if (pya1Var.d(o7h.y0(splitInstallSessionState.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63))) {
                            pya1Var.c(o7h.y0(splitInstallSessionState.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
                        }
                    } else if (iStatus == 7) {
                        o7h.y0(splitInstallSessionState.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                        splitInstallSessionState.totalBytesToDownload();
                        splitInstallSessionState.bytesDownloaded();
                    } else if (iStatus == 8) {
                        o7h.y0(splitInstallSessionState.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                        splitInstallSessionState.totalBytesToDownload();
                    }
                    if (obj2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                pya1 pya1Var2 = this.c;
                Object obj3 = pya1Var2.h;
                SplitInstallSessionState splitInstallSessionState2 = this.d;
                synchronized (obj3) {
                    bpb1 bpb1Var = (wen0) o7h.r0(pya1Var2.g.values());
                    if (bpb1Var != null) {
                        bpb1Var.m((Object) null, pya1.e(splitInstallSessionState2));
                    }
                    break;
                }
                return rih1.a;
            default:
                SplitInstallSessionState splitInstallSessionState3 = this.d;
                d9n d9nVar2 = rih1.a;
                pya1 pya1Var3 = this.c;
                d9n d9nVar3 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    x15 x15Var = pya1Var3.b;
                    this.b = true;
                    Context context = x15Var.a;
                    SplitCompat.install(context);
                    SplitInstallHelper.updateAppInfo(context);
                    if (d9nVar2 == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                o7h.y0(splitInstallSessionState3.moduleNames(), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
                splitInstallSessionState3.totalBytesToDownload();
                return d9nVar2;
        }
    }
}
