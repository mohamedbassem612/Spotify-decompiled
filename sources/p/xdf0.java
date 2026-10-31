package p;

import android.content.Context;
import android.net.NetworkRequest;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.RavelinError;
import com.ravelin.core.repository.RavelinFingerprintWorker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xdf0 extends i6n1 {
    public final /* synthetic */ byte h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xdf0(Context context, String str, c7n1 c7n1Var, byte b) {
        super(context, str, c7n1Var);
        this.h = b;
        this.i = str;
    }

    @Override // p.i6n1, p.j7n1
    public void b(evz0 evz0Var) {
        switch (this.h) {
            case 0:
                dxc dxcVarC = c();
                if (!dxcVarC.f()) {
                    dxcVarC.p(new l7m0(evz0Var, (byte) 29));
                } else if (evz0Var != null) {
                    evz0Var.a(new RavelinError("This request is already enqueued", (String) null, 2, (DefaultConstructorMarker) null));
                }
                break;
            default:
                super.b(evz0Var);
                break;
        }
    }

    @Override // p.i6n1
    public final dxc c() {
        byte b = this.h;
        String str = this.i;
        c7n1 c7n1Var = this.c;
        switch (b) {
            case 0:
                return c7n1Var.a.c(l1d.m("token ", str), this.e);
            default:
                return c7n1.a(c7n1Var, l1d.m("token ", str), this.d);
        }
    }

    @Override // p.i6n1
    public String d() {
        switch (this.h) {
            case 1:
                return "RavelinSendFingerprint";
            default:
                return super.d();
        }
    }

    @Override // p.i6n1
    public gjl e() {
        switch (this.h) {
            case 1:
                return new gjl(new e8o0((NetworkRequest) null), 2, false, false, false, false, -1L, -1L, o7h.p1(new LinkedHashSet()));
            default:
                return super.e();
        }
    }

    @Override // p.i6n1
    public ewq f() {
        switch (this.h) {
            case 1:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("Api", this.i);
                linkedHashMap.put("Payload", w0h1.d(new o5n1((byte) 1)).b(m5n1.z(Events.Companion.serializer()), this.d));
                ewq ewqVar = new ewq(linkedHashMap);
                o0c.N(ewqVar);
                return ewqVar;
            default:
                return super.f();
        }
    }

    @Override // p.i6n1
    public Class g() {
        switch (this.h) {
            case 1:
                return RavelinFingerprintWorker.class;
            default:
                return super.g();
        }
    }
}
