package p;

import android.os.Parcelable;
import com.spotify.podcastinteractivity.commentssheetimpl.page.CommentsSheetPageParameters;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vph implements h0r0 {
    public final qyj a;
    public final CommentsSheetPageParameters b;
    public final umf0 c;
    public final los d;

    public vph(qyj qyjVar, CommentsSheetPageParameters commentsSheetPageParameters, umf0 umf0Var, los losVar) {
        this.a = qyjVar;
        this.b = commentsSheetPageParameters;
        this.c = umf0Var;
        this.d = losVar;
    }

    public final cbr0 a() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarG1 = yon1.G1("COMMENTS", "comments", 376, "comments");
        Parcelable.Creator creator = lik1.CREATOR;
        return new cbr0(new dbr0[]{new bn70(p6r0VarG1, new lik1(this.b.getViewUri()), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, this.d, false, true, true, (nsm0) null, 3677)}, false);
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-1986831022, new qff(this, (byte) 19), true));
    }
}
