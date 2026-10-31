package app.p000rive;

import app.p000rive.core.CommandQueue;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0007\u001a\u00060\bj\u0002`\tH&¨\u0006\n"}, d2 = {"Lapp/rive/HardwareFrameSourceFactory;", "", "create", "Lapp/rive/HardwareFrameSource;", "width", "", "height", "riveWorker", "Lapp/rive/core/CommandQueue;", "Lapp/rive/core/RiveWorker;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface HardwareFrameSourceFactory {
    HardwareFrameSource create(int width, int height, CommandQueue riveWorker);
}
