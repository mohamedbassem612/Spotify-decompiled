package com.spotify.mediabrowserservice.mediabrowserservice;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import p.c681;
import p.d06;
import p.dr91;
import p.e06;
import p.eg;
import p.gih0;
import p.hs41;
import p.j1e1;
import p.jih0;
import p.n5b1;
import p.o5b1;
import p.oo70;
import p.u890;
import p.vsr0;
import p.wo70;
import p.yi5;
import p.zih0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/spotify/mediabrowserservice/mediabrowserservice/SpotifyMediaBrowserService;", "Lp/jih0;", "Lp/o5b1;", "<init>", "()V", "p/kqn1", "src_main_java_com_spotify_mediabrowserservice_mediabrowserservice-mediabrowserservice"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class SpotifyMediaBrowserService extends jih0 implements o5b1 {
    public static final /* synthetic */ int N0 = 0;
    public hs41 X;
    public boolean Y;
    public n5b1 Z;
    public c681 h;
    public oo70 i;
    public zih0 t;

    public final void a(String str, gih0 gih0Var, Bundle bundle) {
        gih0Var.a();
        d().f(new vsr0(str), bundle, new dr91(gih0Var, (byte) 29));
    }

    @Override // p.o5b1
    public final void c(String str) {
        d().j(new vsr0(str));
        g(str);
    }

    public final n5b1 d() {
        n5b1 n5b1Var = this.Z;
        if (n5b1Var != null) {
            return n5b1Var;
        }
        u890.C("serviceHandler");
        throw null;
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("Has valid media session token: " + (!this.Y));
        if (this.Y) {
            zih0 zih0Var = this.t;
            if (zih0Var == null) {
                u890.C("sessionResolver");
                throw null;
            }
            printWriter.println("Connected clients: " + zih0Var.e());
        }
    }

    @Override // p.o5b1
    public final void e(MediaSessionCompat.Token token) {
        MediaSessionCompat.Token token2 = ((jih0) this).f;
        if (token2 != null) {
            this.Y = true;
            zih0 zih0Var = this.t;
            if (zih0Var != null) {
                Logger.d("MBS: Session token already registered. Connected clients: %s", new Object[]{zih0Var.e()});
                return;
            } else {
                u890.C("sessionResolver");
                throw null;
            }
        }
        if (token != null) {
            if (token2 != null) {
                eg.m("The session token has already been set");
            } else {
                ((jih0) this).f = token;
                ((jih0) this).a.z(token);
            }
        }
    }

    @Override // p.o5b1
    public final void g(String str) {
        ((jih0) this).a.s(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate() {
        j1e1.r(this);
        super.onCreate();
        oo70 oo70Var = this.i;
        if (oo70Var == null) {
            u890.C("idleManager");
            throw null;
        }
        boolean z = d06.a == ((e06) ((wo70) oo70Var).b.getValue());
        c681 c681Var = this.h;
        if (c681Var == null) {
            u890.C("factory");
            throw null;
        }
        this.Z = c681Var.s(this, z ? yi5.b : yi5.d);
        Logger.b("MBS: SpotifyMediaBrowserServiceHandler created", new Object[0]);
    }

    public final void onDestroy() {
        d().i();
        Logger.b("MBS: SpotifyMediaBrowserServiceHandler destroyed", new Object[0]);
        super.onDestroy();
    }
}
