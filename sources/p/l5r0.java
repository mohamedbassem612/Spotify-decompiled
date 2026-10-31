package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface l5r0 {
    void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup);

    default void e(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        c(context, layoutInflater, viewGroup);
    }

    View getView();

    void start();

    void stop();
}
