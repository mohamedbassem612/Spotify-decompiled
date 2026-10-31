package p;

import android.app.Application;
import android.net.NetworkRequest;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.repository.MobileReportWorker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r7n1 implements o9b0 {
    public final String a;
    public final Application b;
    public final j7n1 c;

    public r7n1(String str, Application application, j7n1 j7n1Var) {
        this.a = str;
        this.b = application;
        this.c = j7n1Var;
    }

    public final void a(MobileError mobileError) {
        MobileReportRequest mobileReportRequest = new MobileReportRequest("7.0.0-ravelinandroid", "android", (String) null, DeviceId.Companion.Lpt5().LPT3(), (List) null);
        mobileReportRequest.lpt2(Collections.singletonList(mobileError));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Api", this.a);
        linkedHashMap.put("MobileReportRequest", w0h1.d(new o5n1((byte) 1)).b(MobileReportRequest.Companion.serializer(), mobileReportRequest));
        ewq ewqVar = new ewq(linkedHashMap);
        o0c.N(ewqVar);
        qwl1 qwl1VarF = new ciq0(MobileReportWorker.class).i(ewqVar).f(new gjl(new e8o0((NetworkRequest) null), 2, false, false, false, false, -1L, -1L, o7h.p1(new LinkedHashSet())));
        vzn1.n(qwl1VarF);
        diq0 diq0VarB = qwl1VarF.e(10L, TimeUnit.SECONDS).b();
        awl1 awl1VarD = awl1.d(this.b);
        List listX = k4p1.x(diq0VarB);
        if (listX.isEmpty()) {
            hhg1.n("beginWith needs at least one OneTimeWorkRequest.");
        } else {
            new nvl1(awl1VarD, listX).a();
        }
    }
}
