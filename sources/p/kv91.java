package p;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kv91 extends nln {
    public final ten0 e;

    public kv91(ten0 ten0Var) {
        super((byte) 15);
        this.e = ten0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.compose.runtime.snapshots.SnapshotApplyConflictException */
    public final void q() throws SnapshotApplyConflictException {
        this.e.c();
        throw new SnapshotApplyConflictException();
    }
}
