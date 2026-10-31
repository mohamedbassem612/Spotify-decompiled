package p;

import com.spotify.oopsplatform.appintegration.DiagnosticReportUploadWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a2u extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ DiagnosticReportUploadWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2u(DiagnosticReportUploadWorker diagnosticReportUploadWorker, onm onmVar) {
        super(onmVar);
        this.b = diagnosticReportUploadWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(this);
    }
}
