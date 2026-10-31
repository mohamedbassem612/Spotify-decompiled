package com.spotify.inappuserfeedback.worker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.SpotifyCoroutineWorker;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.d9n;
import p.dma1;
import p.dy10;
import p.e331;
import p.eg;
import p.ewq;
import p.ey10;
import p.f46;
import p.f9i1;
import p.g9i1;
import p.hm5;
import p.jy10;
import p.ky10;
import p.lnm;
import p.m231;
import p.mr20;
import p.my10;
import p.ny10;
import p.onm;
import p.ov20;
import p.oy10;
import p.rc2;
import p.th61;
import p.tj21;
import p.u890;
import p.v8d0;
import p.xcg1;
import p.yah0;
import p.yqg;
import p.z8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/spotify/inappuserfeedback/worker/FeedbackUploadWorker;", "Lcom/spotify/androidx/workmanager/SpotifyCoroutineWorker;", "Lp/f9i1;", "userFeedbackRepository", "Lp/dma1;", "", "preferences", "Lp/yqg;", "clock", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "", "isInternalBuild", "Lp/ov20;", "productState", "Lp/mr20;", "Lp/th61;", "sessionState", "<init>", "(Lp/f9i1;Lp/dma1;Lp/yqg;Landroid/content/Context;Landroidx/work/WorkerParameters;ZLp/ov20;Lp/mr20;)V", "p/iaq", "src_main_java_com_spotify_inappuserfeedback_worker-worker"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class FeedbackUploadWorker extends SpotifyCoroutineWorker {
    public final f9i1 i;
    public final yqg j;
    public final boolean k;
    public final ov20 l;
    public final mr20 m;
    public final ey10 n;

    public /* synthetic */ FeedbackUploadWorker(f9i1 f9i1Var, dma1 dma1Var, yqg yqgVar, Context context, WorkerParameters workerParameters, boolean z, ov20 ov20Var, mr20 mr20Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f9i1Var, dma1Var, yqgVar, context, workerParameters, (i & 32) != 0 ? true : z, ov20Var, mr20Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Serializable o(FeedbackUploadWorker feedbackUploadWorker, String str, String str2, List list, String str3, String str4, List list2, String str5, onm onmVar) {
        oy10 oy10Var;
        if (onmVar instanceof oy10) {
            oy10Var = (oy10) onmVar;
            int i = oy10Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oy10Var.b = i - Integer.MIN_VALUE;
            } else {
                oy10Var = new oy10(onmVar);
            }
        } else {
            oy10Var = new oy10(onmVar);
        }
        oy10 oy10Var2 = oy10Var;
        Object objB = oy10Var2.a;
        int i2 = oy10Var2.b;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                g9i1 g9i1Var = feedbackUploadWorker.i;
                oy10Var2.b = 1;
                objB = g9i1Var.b(str, str2, list, str3, str4, list2, str5, oy10Var2);
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
            return (String) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01db  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:113:0x0219  */
    /* JADX WARN: Code duplicated, block: B:115:0x0221  */
    /* JADX WARN: Code duplicated, block: B:117:0x0227  */
    /* JADX WARN: Code duplicated, block: B:120:0x0242  */
    /* JADX WARN: Code duplicated, block: B:130:0x028c  */
    /* JADX WARN: Code duplicated, block: B:132:0x029f  */
    /* JADX WARN: Code duplicated, block: B:139:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[LOOP:0: B:118:0x023c->B:141:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0179  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c5  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f5, code lost:
    
        if (r0 == r7) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        if (r0 == r7) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0214, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e7, code lost:
    
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0148, code lost:
    
        if (r0 == r7) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(p.lnm r20) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.inappuserfeedback.worker.FeedbackUploadWorker.i(p.lnm):java.lang.Object");
    }

    public final void j(String[] strArr) {
        dy10 dy10VarI = this.n.i(((z8d0) this).b.a);
        Set setA = dy10VarI != null ? dy10VarI.a() : null;
        if (setA == null) {
            setA = f46.S0(strArr);
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final v8d0 k() {
        j(new String[0]);
        return new v8d0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, onm onmVar) {
        jy10 jy10Var;
        if (onmVar instanceof jy10) {
            jy10Var = (jy10) onmVar;
            int i = jy10Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jy10Var.d = i - Integer.MIN_VALUE;
            } else {
                jy10Var = new jy10(this, onmVar);
            }
        } else {
            jy10Var = new jy10(this, onmVar);
        }
        Object objO = jy10Var.b;
        int i2 = jy10Var.d;
        boolean z = false;
        if (i2 == 0) {
            hm5.M(objO);
            ky10 ky10Var = new ky10(this, (lnm) null, (byte) 0);
            jy10Var.a = str;
            jy10Var.d = 1;
            objO = rc2.O(5000L, ky10Var, jy10Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = jy10Var.a;
            hm5.M(objO);
        }
        th61 th61Var = (th61) objO;
        if (th61Var == null) {
            return yah0.m(false);
        }
        if (th61Var.b && u890.j(th61Var.a, str)) {
            z = true;
        }
        return yah0.m(z);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable m(String str, String str2, ArrayList arrayList, onm onmVar) {
        my10 my10Var;
        if (onmVar instanceof my10) {
            my10Var = (my10) onmVar;
            int i = my10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                my10Var.c = i - Integer.MIN_VALUE;
            } else {
                my10Var = new my10(this, onmVar);
            }
        } else {
            my10Var = new my10(this, onmVar);
        }
        my10 my10Var2 = my10Var;
        Object objA = my10Var2.a;
        int i2 = my10Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                boolean zA = ((z8d0) this).b.b.a("is_employee");
                g9i1 g9i1Var = this.i;
                my10Var2.c = 1;
                objA = g9i1Var.a(str, str2, arrayList, zA, my10Var2);
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
            return (String) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object n(String str, String str2, ArrayList arrayList, String str3, onm onmVar) {
        ny10 ny10Var;
        String str4;
        String str5;
        String str6;
        String str7;
        ArrayList arrayList2;
        String str8;
        List list;
        if (onmVar instanceof ny10) {
            ny10Var = (ny10) onmVar;
            int i = ny10Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                ny10Var.t = i - Integer.MIN_VALUE;
            } else {
                ny10Var = new ny10(this, onmVar);
            }
        } else {
            ny10Var = new ny10(this, onmVar);
        }
        ny10 ny10Var2 = ny10Var;
        Object obj = ny10Var2.h;
        int i2 = ny10Var2.t;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            WorkerParameters workerParameters = ((z8d0) this).b;
            ewq ewqVar = workerParameters.b;
            ewq ewqVar2 = workerParameters.b;
            String strC = ewqVar.c("jira_feature");
            String[] strArrD = ewqVar2.d("jira_labels");
            List listQ0 = strArrD != null ? f46.Q0(strArrD) : null;
            String strC2 = ewqVar2.c("jira_report_source");
            String strC3 = ewqVar2.c("jira_project_key");
            String strI = strC2 != null ? xcg1.i(str2, "\n\n---\nReport source: ", strC2) : str2;
            ny10Var2.a = str;
            ny10Var2.b = arrayList;
            ny10Var2.c = str3;
            ny10Var2.d = strC;
            ny10Var2.e = listQ0;
            ny10Var2.f = strC3;
            ny10Var2.g = strI;
            ny10Var2.t = 1;
            Object objL = l(str3, ny10Var2);
            if (objL != d9nVar) {
                String str9 = strI;
                str4 = str3;
                str5 = str9;
                str6 = strC3;
                obj = objL;
                str7 = strC;
                arrayList2 = arrayList;
                str8 = str;
                list = listQ0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = ny10Var2.e;
            hm5.M(obj);
            return ((e331) obj).a;
        }
        str5 = ny10Var2.g;
        String str10 = ny10Var2.f;
        List list3 = ny10Var2.e;
        String str11 = ny10Var2.d;
        str4 = ny10Var2.c;
        ArrayList arrayList3 = ny10Var2.b;
        String str12 = ny10Var2.a;
        hm5.M(obj);
        list = list3;
        str8 = str12;
        str7 = str11;
        arrayList2 = arrayList3;
        str6 = str10;
        if (!((Boolean) obj).booleanValue()) {
            return new m231(new tj21());
        }
        ny10Var2.a = null;
        ny10Var2.b = null;
        ny10Var2.c = null;
        ny10Var2.d = null;
        ny10Var2.e = null;
        ny10Var2.f = null;
        ny10Var2.g = null;
        ny10Var2.t = 2;
        Serializable serializableO = o(this, str8, str5, arrayList2, str4, str7, list, str6, ny10Var2);
        return serializableO == d9nVar ? d9nVar : serializableO;
    }

    public FeedbackUploadWorker(f9i1 f9i1Var, dma1 dma1Var, yqg yqgVar, Context context, WorkerParameters workerParameters, boolean z, ov20 ov20Var, mr20 mr20Var) {
        super(context, workerParameters);
        this.i = f9i1Var;
        this.j = yqgVar;
        this.k = z;
        this.l = ov20Var;
        this.m = mr20Var;
        this.n = new ey10(dma1Var);
    }
}
