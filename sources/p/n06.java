package p;

import android.os.Build;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n06 {
    public static final n06 a = new n06();

    public final void a(RemoteViews remoteViews, int i, b5u b5uVar) {
        if (Build.VERSION.SDK_INT < 31) {
            hhg1.f("setClipToOutline is only available on SDK 31 and higher");
            return;
        }
        remoteViews.setBoolean(i, "setClipToOutline", true);
        if (b5uVar instanceof t4u) {
            remoteViews.setViewOutlinePreferredRadius(i, ((t4u) b5uVar).a, 1);
        } else if (b5uVar instanceof x4u) {
            remoteViews.setViewOutlinePreferredRadiusDimen(i, 2131167210);
        } else {
            bhn0.B(b5uVar.getClass().getCanonicalName(), "Rounded corners should not be ");
        }
    }

    public final void b(RemoteViews remoteViews, int i, b5u b5uVar) {
        if (b5uVar instanceof z4u) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
            return;
        }
        if (b5uVar instanceof u4u) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
            return;
        }
        if (b5uVar instanceof t4u) {
            remoteViews.setViewLayoutHeight(i, ((t4u) b5uVar).a, 1);
            return;
        }
        if (b5uVar instanceof x4u) {
            remoteViews.setViewLayoutHeightDimen(i, 2131167210);
        } else if (u890.j(b5uVar, v4u.a)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            eg.o();
        }
    }

    public final void c(RemoteViews remoteViews, int i, b5u b5uVar) {
        if (b5uVar instanceof z4u) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
            return;
        }
        if (b5uVar instanceof u4u) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
            return;
        }
        if (b5uVar instanceof t4u) {
            remoteViews.setViewLayoutWidth(i, ((t4u) b5uVar).a, 1);
            return;
        }
        if (b5uVar instanceof x4u) {
            remoteViews.setViewLayoutWidthDimen(i, 2131167210);
        } else if (u890.j(b5uVar, v4u.a)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            eg.o();
        }
    }
}
