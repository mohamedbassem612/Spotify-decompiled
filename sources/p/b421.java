package p;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.drawable.Icon;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class b421 {
    public static final void a(RemoteViews remoteViews, int i, String str, BlendMode blendMode) {
        remoteViews.setBlendMode(i, str, blendMode);
    }

    public static final void b(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setCharSequence(i, str, i2);
    }

    public static final void c(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setCharSequenceAttr(i, str, i2);
    }

    public static final void d(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColor(i, str, i2);
    }

    public static final void e(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorAttr(i, str, i2);
    }

    public static final void f(RemoteViews remoteViews, int i, String str, int i2, int i3) {
        remoteViews.setColorInt(i, str, i2, i3);
    }

    public static final void g(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorStateList(i, str, i2);
    }

    public static final void h(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList) {
        remoteViews.setColorStateList(i, str, colorStateList);
    }

    public static final void i(RemoteViews remoteViews, int i, String str, ColorStateList colorStateList, ColorStateList colorStateList2) {
        remoteViews.setColorStateList(i, str, colorStateList, colorStateList2);
    }

    public static final void j(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setColorStateListAttr(i, str, i2);
    }

    public static final void k(RemoteViews remoteViews, int i, String str, float f, int i2) {
        remoteViews.setFloatDimen(i, str, f, i2);
    }

    public static final void l(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setFloatDimen(i, str, i2);
    }

    public static final void m(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setFloatDimenAttr(i, str, i2);
    }

    public static final void n(RemoteViews remoteViews, int i, String str, Icon icon, Icon icon2) {
        remoteViews.setIcon(i, str, icon, icon2);
    }

    public static final void o(RemoteViews remoteViews, int i, String str, float f, int i2) {
        remoteViews.setIntDimen(i, str, f, i2);
    }

    public static final void p(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setIntDimen(i, str, i2);
    }

    public static final void q(RemoteViews remoteViews, int i, String str, int i2) {
        remoteViews.setIntDimenAttr(i, str, i2);
    }
}
