package p;

import android.content.res.Resources;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class igu0 implements ba6 {
    public final Resources a;
    public final uh4 b;
    public final ljg c;
    public final bn70 d;
    public final boolean e;
    public final spx0 f;

    public igu0(Resources resources, uh4 uh4Var, ljg ljgVar) {
        this.a = resources;
        this.b = uh4Var;
        this.c = ljgVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new bn70(yon1.G1("MAGPIE_PROMPT", "magpie/prompt", 984, "magpie"), nik1.e6, (nar0) null);
        this.e = uh4Var.b();
        this.f = new spx0();
    }

    public final void a(psk pskVar) {
        if (pskVar == psk.b && this.b.g()) {
            ljg.c(this.c, "promptable-playlist:prompt-cancelled:v1", (TriggerType) null, (String) null, (List) null, (tv80) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 510).subscribe(xfs0.Z, xfs0.N0);
        }
    }

    public final String b(psk pskVar) {
        return this.a.getString(2131952436);
    }

    public final String d() {
        return this.a.getString(2131952437);
    }

    public final String f(psk pskVar, boolean z) {
        int iOrdinal = pskVar.ordinal();
        Resources resources = this.a;
        if (iOrdinal == 0) {
            String string = z ? resources.getString(2131952440) : resources.getString(2131952443);
            string.getClass();
            return string;
        }
        if (iOrdinal == 1) {
            return resources.getString(2131952443);
        }
        if (iOrdinal == 2) {
            return resources.getString(2131952440);
        }
        eg.o();
        return null;
    }

    public final bn70 getIdentifier() {
        return this.d;
    }

    public final upx0 i() {
        return this.f;
    }

    public final boolean j() {
        return this.e;
    }
}
