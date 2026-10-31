package p;

import com.spotify.rcs.model.GranularConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sc50 {
    public final String a;
    public final long b;
    public final List c;
    public final long d;
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ sc50(String str, long j, List list, long j2, int i) {
        String str2 = (i & 1) != 0 ? "" : str;
        int i2 = i & 8;
        this((i & 2) != 0 ? -1L : j, i2 != 0 ? -1L : j2, str2, "", (i & 4) != 0 ? z6x.a : list);
    }

    public static sc50 a(sc50 sc50Var, List list, int i) {
        String str = sc50Var.a;
        long j = sc50Var.b;
        if ((i & 4) != 0) {
            list = sc50Var.c;
        }
        return new sc50(j, sc50Var.d, str, (i & 16) != 0 ? sc50Var.e : null, list);
    }

    public final byte[] b() {
        GranularConfiguration.Builder etag = GranularConfiguration.H().setConfigurationAssignmentId(this.a).setPolicySnapshotId(this.d).setRcsFetchTime(this.b).setEtag(this.e);
        List<m67> list = this.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (m67 m67Var : list) {
            String str = m67Var.e;
            Integer num = m67Var.d;
            GranularConfiguration.AssignedPropertyValue.Builder policyId = GranularConfiguration.AssignedPropertyValue.newBuilder().setName(m67Var.a).setComponentId(m67Var.b).setGroupId(m67Var.f).setPolicyId(m67Var.g);
            Boolean bool = m67Var.c;
            if (bool != null) {
                policyId.setBoolValue(GranularConfiguration.AssignedPropertyValue.BoolValue.newBuilder().setValue(bool.booleanValue()));
            } else if (num != null) {
                policyId.setIntValue(GranularConfiguration.AssignedPropertyValue.IntValue.newBuilder().setValue(num.intValue()));
            } else if (str != null) {
                policyId.setEnumValue(GranularConfiguration.AssignedPropertyValue.EnumValue.newBuilder().setValue(str));
            }
            arrayList.add((GranularConfiguration.AssignedPropertyValue) policyId.build());
        }
        return ((GranularConfiguration) etag.addAllProperties(arrayList).build()).toByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc50)) {
            return false;
        }
        sc50 sc50Var = (sc50) obj;
        return u890.j(this.a, sc50Var.a) && this.b == sc50Var.b && u890.j(this.c, sc50Var.c) && this.d == sc50Var.d && u890.j(this.e, sc50Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.f(f4i1.b(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
    }

    public sc50(long j, long j2, String str, String str2, List list) {
        this.a = str;
        this.b = j;
        this.c = list;
        this.d = j2;
        this.e = str2;
    }
}
