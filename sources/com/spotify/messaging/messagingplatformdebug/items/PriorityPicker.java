package com.spotify.messaging.messagingplatformdebug.items;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import p.bow0;
import p.iu30;
import p.wnw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\fJ!\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/spotify/messaging/messagingplatformdebug/items/PriorityPicker;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", "Lp/wnw0;", "Lp/rih1;", "onPriorityUpdated", "setOnPriorityUpdatedListener", "(Lp/iu30;)V", "src_main_java_com_spotify_messaging_messagingplatformdebug-messagingplatformdebug"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PriorityPicker extends FrameLayout {
    public final Spinner a;

    public PriorityPicker(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(2131625455, (ViewGroup) this, true);
        this.a = (Spinner) findViewById(2131428534);
        wnw0[] wnw0VarArrValues = wnw0.values();
        ArrayList arrayList = new ArrayList(wnw0VarArrValues.length);
        for (wnw0 wnw0Var : wnw0VarArrValues) {
            arrayList.add(wnw0Var.name());
        }
        this.a.setAdapter((SpinnerAdapter) new ArrayAdapter(this.a.getContext(), R.layout.simple_spinner_dropdown_item, arrayList));
        this.a.setSelection(arrayList.indexOf("DEFAULT"));
    }

    public final void setOnPriorityUpdatedListener(iu30 onPriorityUpdated) {
        this.a.setOnItemSelectedListener(new bow0(onPriorityUpdated, this));
    }

    public PriorityPicker(Context context) {
        this(context, null);
    }

    public PriorityPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
