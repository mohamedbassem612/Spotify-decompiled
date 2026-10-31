package com.spotify.artist.creatorartist;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import p.zfs;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public class ExpandableEllipsizeTextView extends AppCompatTextView {
    public CharSequence i;
    public boolean t;

    public ExpandableEllipsizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setOnClickListener(new zfs(this, (byte) 12));
    }

    public void setShouldExpandText(boolean z) {
        this.t = z;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.i = charSequence;
        w();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w() {
        CharSequence charSequenceAppend = this.i;
        if (!this.t && !TextUtils.isEmpty(charSequenceAppend) && this.i.length() > 256) {
            charSequenceAppend = new SpannableStringBuilder(this.i, 0, 257).append((CharSequence) "...");
        }
        super/*android.widget.TextView*/.setText(charSequenceAppend, TextView.BufferType.SPANNABLE);
    }

    public ExpandableEllipsizeTextView(Context context) {
        this(context, null);
    }
}
