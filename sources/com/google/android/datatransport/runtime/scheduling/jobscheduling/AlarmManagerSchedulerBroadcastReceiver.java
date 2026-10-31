package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p.aow0;
import p.ix7;
import p.jog1;
import p.k;
import p.s29;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        jog1.b(context);
        ix7 ix7VarA = s29.a();
        ix7VarA.s(queryParameter);
        ix7VarA.d = aow0.b(iIntValue);
        if (queryParameter2 != null) {
            ix7VarA.c = Base64.decode(queryParameter2, 0);
        }
        jog1.a().d.p(ix7VarA.j(), i, new k((byte) 3));
    }
}
