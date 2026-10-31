package p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sct0 implements ss50 {
    public final View a;

    public sct0(View view) {
        this.a = view;
    }

    public final void a(int i) {
        int i2 = 16;
        if (!vs50.a(i, 16)) {
            i2 = 6;
            if (!vs50.a(i, 6)) {
                i2 = 13;
                if (!vs50.a(i, 13)) {
                    i2 = 23;
                    if (!vs50.a(i, 23)) {
                        i2 = 3;
                        if (!vs50.a(i, 3)) {
                            i2 = 0;
                            if (!vs50.a(i, 0)) {
                                i2 = 17;
                                if (!vs50.a(i, 17)) {
                                    i2 = 27;
                                    if (!vs50.a(i, 27)) {
                                        i2 = 26;
                                        if (!vs50.a(i, 26)) {
                                            i2 = 9;
                                            if (!vs50.a(i, 9)) {
                                                i2 = 22;
                                                if (!vs50.a(i, 22)) {
                                                    i2 = 21;
                                                    if (!vs50.a(i, 21)) {
                                                        i2 = 1;
                                                        if (!vs50.a(i, 1)) {
                                                            i2 = -1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        WeakHashMap weakHashMap = b8k1.a;
        int iE = b0o1.e(i2);
        if (iE == -1) {
            return;
        }
        this.a.performHapticFeedback(iE);
    }
}
