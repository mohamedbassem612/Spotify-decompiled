package com.comscore.android.util.update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class UpdateFrom5_4_x$a implements Runnable {
    final /* synthetic */ UpdateFrom5_4_x a;

    public UpdateFrom5_4_x$a(UpdateFrom5_4_x updateFrom5_4_x) {
        this.a = updateFrom5_4_x;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(400L);
        } catch (InterruptedException unused) {
        }
        if (UpdateFrom5_4_x.a(this.a).exists()) {
            UpdateFrom5_4_x.a(this.a).delete();
        }
        if (UpdateFrom5_4_x.b(this.a).exists()) {
            UpdateFrom5_4_x.b(this.a).delete();
        }
    }
}
