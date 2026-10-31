package com.spotify.login.adaptiveauthentication.challenge.smscode;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;
import p.a69;
import p.b8k1;
import p.h860;
import p.i860;
import p.tym0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\u0011\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/spotify/login/adaptiveauthentication/challenge/smscode/HiddenOtpEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp/h860;", "listener", "Lp/rih1;", "setOnInputActionListener", "(Lp/h860;)V", "p/i860", "p/a69", "src_main_java_com_spotify_login_adaptiveauthentication-adaptiveauthentication"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HiddenOtpEditText extends AppCompatEditText {
    public static final String[] i = {"text/*"};
    public h860 h;

    /* JADX WARN: Multi-variable type inference failed */
    public HiddenOtpEditText(Context context) {
        super(context);
        b8k1.s(this, i, new a69(this, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipRect(0, 0, 0, 0);
        super/*android.view.View*/.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new i860(this, super.onCreateInputConnection(editorInfo));
    }

    public final void onDraw(Canvas canvas) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        tym0 tym0Var;
        if ((i2 == 67 && (tym0Var = this.h) != null) ? tym0Var.i() : false) {
            return true;
        }
        return super/*android.view.View*/.onKeyDown(i2, keyEvent);
    }

    public final void setOnInputActionListener(h860 listener) {
        this.h = listener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HiddenOtpEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b8k1.s(this, i, new a69(this, (byte) 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HiddenOtpEditText(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        b8k1.s(this, i, new a69(this, (byte) 1));
    }
}
