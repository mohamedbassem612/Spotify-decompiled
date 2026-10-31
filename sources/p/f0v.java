package p;

import android.util.AttributeSet;
import android.view.View;
import com.spotify.encoreconsumermobile.elements.downloadbutton.DownloadButtonView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f0v extends zaz {
    public final cbz c;
    public final nzu d;

    public f0v(cbz cbzVar) {
        super(cbzVar.a);
        this.d = nzu.X0;
        this.c = cbzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        return new DownloadButtonView(getContext(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public final void c(View view, Object obj) {
        DownloadButtonView downloadButtonView = (DownloadButtonView) view;
        sru sruVar = (sru) obj;
        cbz cbzVar = this.c;
        if (cbzVar == null) {
            u890.C("viewContext");
            throw null;
        }
        rcf0 rcf0Var = cbzVar.b;
        String str = sruVar.b;
        p1v p1vVar = rcf0Var.b.a;
        p1v p1vVar2 = sruVar.a;
        boolean zQ = rcf0Var.a.q(p1vVar, p1vVar2);
        if (!str.equals(rcf0Var.c) || (!zQ && p1vVar.getClass() != p1vVar2.getClass())) {
            rcf0Var.b = new sru(m1v.a, null, null, null, 14);
        }
        downloadButtonView.b(rcf0Var.b, sruVar);
        rcf0Var.b = sruVar;
        rcf0Var.c = str;
    }

    public iu30 getActionModelExtractor() {
        return this.d;
    }
}
