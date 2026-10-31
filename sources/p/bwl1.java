package p;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class bwl1 extends tv30 implements dv30 {
    public static final bwl1 a = new bwl1(6, cwl1.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        btk btkVar = (btk) obj2;
        dwl1 dwl1Var = (dwl1) obj3;
        lsw0 lsw0Var = (lsw0) obj6;
        int i = om41.a;
        hed1 hed1Var = new hed1(context, (WorkDatabase) obj4, btkVar);
        jzq0.a(context, SystemJobService.class, true);
        qs10.a().getClass();
        return p7h.M(new im41[]{hed1Var, new qe50(context, btkVar, (z2g1) obj5, lsw0Var, new t8r0(lsw0Var, dwl1Var), dwl1Var)});
    }
}
