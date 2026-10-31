package p;

import app.rive.Artboard;
import app.rive.RiveFile;
import app.rive.StateMachine;
import app.rive.ViewModelInstance;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v8e0 {
    public final RiveFile a;
    public final Artboard b;
    public final StateMachine c;
    public final ViewModelInstance d;

    public v8e0(RiveFile riveFile, Artboard artboard, StateMachine stateMachine, ViewModelInstance viewModelInstance) {
        this.a = riveFile;
        this.b = artboard;
        this.c = stateMachine;
        this.d = viewModelInstance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8e0)) {
            return false;
        }
        v8e0 v8e0Var = (v8e0) obj;
        return u890.j(this.a, v8e0Var.a) && u890.j(this.b, v8e0Var.b) && u890.j(this.c, v8e0Var.c) && u890.j(this.d, v8e0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        ViewModelInstance viewModelInstance = this.d;
        return iHashCode + (viewModelInstance == null ? 0 : viewModelInstance.hashCode());
    }
}
