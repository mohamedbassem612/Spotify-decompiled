package app.p000rive.core;

import kotlin.Metadata;
import p.cy30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJH\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0011JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010\u0011¨\u0006-"}, d2 = {"Lapp/rive/core/Listeners;", "Ljava/lang/AutoCloseable;", "", "fileListener", "artboardListener", "stateMachineListener", "viewModelInstanceListener", "imageListener", "audioListener", "fontListener", "<init>", "(JJJJJJJ)V", "Lp/rih1;", "cppDelete", "close", "()V", "component1", "()J", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JJJJJJJ)Lapp/rive/core/Listeners;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getFileListener", "getArtboardListener", "getStateMachineListener", "getViewModelInstanceListener", "getImageListener", "getAudioListener", "getFontListener", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Listeners implements AutoCloseable {
    public static final int $stable = 0;
    private final long artboardListener;
    private final long audioListener;
    private final long fileListener;
    private final long fontListener;
    private final long imageListener;
    private final long stateMachineListener;
    private final long viewModelInstanceListener;

    public Listeners(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.fileListener = j;
        this.artboardListener = j2;
        this.stateMachineListener = j3;
        this.viewModelInstanceListener = j4;
        this.imageListener = j5;
        this.audioListener = j6;
        this.fontListener = j7;
    }

    private final native void cppDelete(long fileListener, long artboardListener, long stateMachineListener, long viewModelInstanceListener, long imageListener, long audioListener, long fontListener);

    @Override // java.lang.AutoCloseable
    public void close() {
        cppDelete(this.fileListener, this.artboardListener, this.stateMachineListener, this.viewModelInstanceListener, this.imageListener, this.audioListener, this.fontListener);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFileListener() {
        return this.fileListener;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getArtboardListener() {
        return this.artboardListener;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStateMachineListener() {
        return this.stateMachineListener;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getViewModelInstanceListener() {
        return this.viewModelInstanceListener;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getImageListener() {
        return this.imageListener;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAudioListener() {
        return this.audioListener;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getFontListener() {
        return this.fontListener;
    }

    public final Listeners copy(long fileListener, long artboardListener, long stateMachineListener, long viewModelInstanceListener, long imageListener, long audioListener, long fontListener) {
        return new Listeners(fileListener, artboardListener, stateMachineListener, viewModelInstanceListener, imageListener, audioListener, fontListener);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Listeners)) {
            return false;
        }
        Listeners listeners = (Listeners) other;
        return this.fileListener == listeners.fileListener && this.artboardListener == listeners.artboardListener && this.stateMachineListener == listeners.stateMachineListener && this.viewModelInstanceListener == listeners.viewModelInstanceListener && this.imageListener == listeners.imageListener && this.audioListener == listeners.audioListener && this.fontListener == listeners.fontListener;
    }

    public final long getArtboardListener() {
        return this.artboardListener;
    }

    public final long getAudioListener() {
        return this.audioListener;
    }

    public final long getFileListener() {
        return this.fileListener;
    }

    public final long getFontListener() {
        return this.fontListener;
    }

    public final long getImageListener() {
        return this.imageListener;
    }

    public final long getStateMachineListener() {
        return this.stateMachineListener;
    }

    public final long getViewModelInstanceListener() {
        return this.viewModelInstanceListener;
    }

    public int hashCode() {
        return Long.hashCode(this.fontListener) + cy30.f(cy30.f(cy30.f(cy30.f(cy30.f(Long.hashCode(this.fileListener) * 31, this.artboardListener, 31), this.stateMachineListener, 31), this.viewModelInstanceListener, 31), this.imageListener, 31), this.audioListener, 31);
    }

    public String toString() {
        long j = this.fileListener;
        long j2 = this.artboardListener;
        long j3 = this.stateMachineListener;
        long j4 = this.viewModelInstanceListener;
        long j5 = this.imageListener;
        long j6 = this.audioListener;
        long j7 = this.fontListener;
        StringBuilder sbS = cy30.s(j, "Listeners(fileListener=", ", artboardListener=");
        sbS.append(j2);
        sbS.append(", stateMachineListener=");
        sbS.append(j3);
        sbS.append(", viewModelInstanceListener=");
        sbS.append(j4);
        sbS.append(", imageListener=");
        sbS.append(j5);
        sbS.append(", audioListener=");
        sbS.append(j6);
        sbS.append(", fontListener=");
        sbS.append(j7);
        sbS.append(")");
        return sbS.toString();
    }
}
