package p;

import com.spotify.rcs.resolver.grpc.v0.Configuration;
import com.spotify.rcs.resolver.grpc.v0.f;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class l67 {
    public static m67 a() {
        return new m67("", "", (Boolean) null, (Integer) null, (String) null, 0L, 0L);
    }

    public static m67 b(Configuration.AssignedValue assignedValue) {
        return new m67(assignedValue.s().getName(), assignedValue.s().p(), assignedValue.t() == f.a ? Boolean.valueOf(assignedValue.o().getValue()) : null, assignedValue.t() == f.b ? Integer.valueOf(assignedValue.q().getValue()) : null, assignedValue.t() == f.c ? assignedValue.p().getValue() : null, assignedValue.r().p(), assignedValue.r().getPolicyId());
    }
}
