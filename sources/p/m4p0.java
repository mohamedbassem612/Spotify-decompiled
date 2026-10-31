package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public interface m4p0 {
    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void start();

    void stop();

    default void destroy() {
    }
}
