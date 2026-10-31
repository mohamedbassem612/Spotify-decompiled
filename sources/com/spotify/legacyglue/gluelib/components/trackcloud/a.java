package com.spotify.legacyglue.gluelib.components.trackcloud;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Collections;
import p.b2u;
import p.nx40;
import p.uwd;
import p.v9w0;
import p.zkf1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a implements nx40 {
    public final TrackCloudTextView a;
    public final TextView b;
    public final ViewGroup c;
    public final zkf1 d = new zkf1();

    public a(Context context, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(2131626180, viewGroup, false);
        this.c = viewGroup2;
        TextView textView = (TextView) viewGroup2.findViewById(2131431356);
        this.b = textView;
        View view = (TrackCloudTextView) viewGroup2.findViewById(2131431466);
        this.a = view;
        v9w0 v9w0VarQ = b2u.q(viewGroup2);
        Collections.addAll(v9w0VarQ.c, textView, view);
        v9w0VarQ.a();
    }

    public final void a(uwd uwdVar) {
        zkf1 zkf1Var = this.d;
        TrackCloudTextView trackCloudTextView = this.a;
        zkf1Var.c(trackCloudTextView, uwdVar);
        trackCloudTextView.i = zkf1Var;
        trackCloudTextView.setMaxLines(zkf1Var.g);
        trackCloudTextView.setText(zkf1Var.a);
        String str = (String) uwdVar.g;
        TextView textView = this.b;
        textView.setText(str);
        textView.setVisibility(!TextUtils.isEmpty((String) uwdVar.g) ? 0 : 8);
        textView.setGravity(uwdVar.f ? 8388611 : 17);
    }

    public final View getView() {
        return this.c;
    }
}
