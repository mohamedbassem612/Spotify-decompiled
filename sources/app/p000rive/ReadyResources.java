package app.p000rive;

import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lapp/rive/ReadyResources;", "", "artboard", "Lapp/rive/Artboard;", "stateMachine", "Lapp/rive/StateMachine;", "(Lapp/rive/Artboard;Lapp/rive/StateMachine;)V", "getArtboard", "()Lapp/rive/Artboard;", "getStateMachine", "()Lapp/rive/StateMachine;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final /* data */ class ReadyResources {
    private final Artboard artboard;
    private final StateMachine stateMachine;

    public ReadyResources(Artboard artboard, StateMachine stateMachine) {
        this.artboard = artboard;
        this.stateMachine = stateMachine;
    }

    public static /* synthetic */ ReadyResources copy$default(ReadyResources readyResources, Artboard artboard, StateMachine stateMachine, int i, Object obj) {
        if ((i & 1) != 0) {
            artboard = readyResources.artboard;
        }
        if ((i & 2) != 0) {
            stateMachine = readyResources.stateMachine;
        }
        return readyResources.copy(artboard, stateMachine);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Artboard getArtboard() {
        return this.artboard;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StateMachine getStateMachine() {
        return this.stateMachine;
    }

    public final ReadyResources copy(Artboard artboard, StateMachine stateMachine) {
        return new ReadyResources(artboard, stateMachine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadyResources)) {
            return false;
        }
        ReadyResources readyResources = (ReadyResources) other;
        return u890.j(this.artboard, readyResources.artboard) && u890.j(this.stateMachine, readyResources.stateMachine);
    }

    public final Artboard getArtboard() {
        return this.artboard;
    }

    public final StateMachine getStateMachine() {
        return this.stateMachine;
    }

    public int hashCode() {
        return this.stateMachine.hashCode() + (this.artboard.hashCode() * 31);
    }

    public String toString() {
        return "ReadyResources(artboard=" + this.artboard + ", stateMachine=" + this.stateMachine + ")";
    }
}
