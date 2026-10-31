package com.spotify.messaging.messagingplatformdebug.items;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.iu30;
import p.ldr;
import p.lgh;
import p.nhc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\fJ!\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/spotify/messaging/messagingplatformdebug/items/DelayChooser;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", "Lp/rih1;", "onDelayUpdated", "setOnDelayUpdatedListener", "(Lp/iu30;)V", "src_main_java_com_spotify_messaging_messagingplatformdebug-messagingplatformdebug"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class DelayChooser extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final CheckBox a;
    public final TextInputEditText b;

    public DelayChooser(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(2131624526, (ViewGroup) this, true);
        this.a = (CheckBox) findViewById(2131428427);
        TextInputEditText textInputEditTextFindViewById = findViewById(2131428429);
        this.b = textInputEditTextFindViewById;
        textInputEditTextFindViewById.setEnabled(false);
    }

    public final int a() {
        String string;
        Integer numC0;
        if (!this.a.isChecked()) {
            return 0;
        }
        TextInputEditText textInputEditText = this.b;
        Editable text = textInputEditText.getText();
        int iIntValue = (text == null || (string = text.toString()) == null || (numC0 = nhc1.c0(string)) == null) ? -1 : numC0.intValue();
        if (iIntValue == -1) {
            textInputEditText.setError("Invalid delay value");
        }
        return iIntValue;
    }

    public final void setOnDelayUpdatedListener(iu30 onDelayUpdated) {
        this.a.setOnCheckedChangeListener(new ldr(this, onDelayUpdated, (byte) 2));
        this.b.addTextChangedListener(new lgh(onDelayUpdated, this, (byte) 1));
    }

    public DelayChooser(Context context) {
        this(context, null);
    }

    public DelayChooser(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
