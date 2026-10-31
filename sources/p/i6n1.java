package p;

import android.content.Context;
import android.net.NetworkRequest;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.model.RavelinError;
import com.ravelin.core.model.RavelinJSONError;
import com.ravelin.core.model.SharedPackages;
import com.ravelin.core.repository.MobileReportWorker;
import com.ravelin.core.repository.RavelinWorker;
import com.spotify.accountswitching.v1.Account;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class i6n1 implements j7n1 {
    public static final String g;
    public final Context a;
    public final String b;
    public final c7n1 c;
    public Events d;
    public SharedPackages e;
    public String f;

    static {
        String canonicalName = i6n1.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = i6n1.class.getSimpleName();
        }
        g = canonicalName;
    }

    public i6n1(Context context, String str, c7n1 c7n1Var) {
        this.a = context;
        this.b = str;
        this.c = c7n1Var;
    }

    @Override // p.j7n1
    public void b(evz0 evz0Var) {
        dxc dxcVarC = c();
        if (dxcVarC != null) {
            if (!dxcVarC.f()) {
                dxcVarC.p(new a6n1(this, evz0Var, (byte) 1));
            } else if (evz0Var != null) {
                evz0Var.a(new RavelinError("This request is already enqueued", (String) null, 2, (DefaultConstructorMarker) null));
            }
        }
    }

    public dxc c() {
        return this.c.a.b(l1d.m("token ", this.b), this.d);
    }

    public String d() {
        return "RavelinSendInformation";
    }

    public gjl e() {
        return new gjl(new e8o0((NetworkRequest) null), 2, false, false, false, false, -1L, -1L, o7h.p1(new LinkedHashSet()));
    }

    public ewq f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Api", this.b);
        linkedHashMap.put("Payload", w0h1.d(new o5n1((byte) 1)).b(m5n1.z(Events.Companion.serializer()), this.d));
        ewq ewqVar = new ewq(linkedHashMap);
        o0c.N(ewqVar);
        return ewqVar;
    }

    public Class g() {
        return RavelinWorker.class;
    }

    public final void h(RavelinJSONError ravelinJSONError, boolean z) {
        qwl1 qwl1VarF = new ciq0(g()).i(f()).f(e());
        vzn1.n(qwl1VarF);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        diq0 diq0VarB = qwl1VarF.e(1L, timeUnit).a(d()).b();
        awl1 awl1VarD = awl1.d(this.a);
        List listX = k4p1.x(diq0VarB);
        if (listX.isEmpty()) {
            hhg1.n("beginWith needs at least one OneTimeWorkRequest.");
            return;
        }
        nvl1 nvl1Var = new nvl1(awl1VarD, listX);
        if (z) {
            nvl1Var.a();
            return;
        }
        ciq0 ciq0Var = new ciq0(MobileReportWorker.class);
        MobileReportRequest mobileReportRequest = new MobileReportRequest("7.0.0-ravelinandroid", "android", (String) null, DeviceId.Companion.Lpt5().LPT3(), Collections.singletonList(new MobileError(ravelinJSONError, this.f, new ErrorMetadata(300, "Connectivity", "An IO error occurred while trying to send an API request to a Ravelin endpoint", (String) null, b0o1.b(), (String) null, (Integer) null, Account.SELF_MANAGED_ACCOUNT_FIELD_NUMBER, (DefaultConstructorMarker) null))));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Api", this.b);
        linkedHashMap.put("MobileReportRequest", w0h1.d(new o5n1((byte) 1)).b(MobileReportRequest.Companion.serializer(), mobileReportRequest));
        ewq ewqVar = new ewq(linkedHashMap);
        o0c.N(ewqVar);
        qwl1 qwl1VarF2 = ciq0Var.i(ewqVar).f(e());
        vzn1.n(qwl1VarF2);
        List listSingletonList = Collections.singletonList(qwl1VarF2.e(1L, timeUnit).b());
        if (!listSingletonList.isEmpty()) {
            nvl1Var = new nvl1(awl1VarD, (String) null, 2, listSingletonList, Collections.singletonList(nvl1Var));
        }
        nvl1Var.a();
    }

    public final Events i() {
        return this.d;
    }
}
