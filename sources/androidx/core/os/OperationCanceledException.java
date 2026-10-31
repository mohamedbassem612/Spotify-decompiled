package androidx.core.os;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException(String str) {
        super(str.toString());
    }

    public OperationCanceledException() {
        super("The operation has been canceled.");
    }
}
