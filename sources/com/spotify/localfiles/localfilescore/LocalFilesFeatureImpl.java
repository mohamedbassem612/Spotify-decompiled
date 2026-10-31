package com.spotify.localfiles.localfilescore;

import android.net.Uri;
import com.google.protobuf.Empty;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$DefaultSource;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetSourcesResponse;
import com.spotify.localfiles.localfilesmonorepo.AddedLocalFile;
import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import com.spotify.localfiles.mediastore.OpenedAudioFiles;
import java.util.Iterator;
import kotlin.Metadata;
import p.d9n;
import p.eee0;
import p.eg;
import p.h290;
import p.hm5;
import p.lnm;
import p.mnc0;
import p.mr20;
import p.onm;
import p.q8r;
import p.rih1;
import p.vr20;
import p.xde0;
import p.xnz;
import p.ynz;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/spotify/localfiles/localfilescore/LocalFilesFeatureImpl;", "Lcom/spotify/localfiles/localfilesmonorepo/LocalFilesFeature;", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "openedAudioFiles", "Lp/xde0;", "localFilesClient", "<init>", "(Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;Lp/xde0;)V", "Lp/rih1;", "clearLocalFileSources", "(Lp/lnm;)Ljava/lang/Object;", "", "enabled", "setEnabled", "(ZLp/lnm;)Ljava/lang/Object;", "Lp/mr20;", "isEnabled", "()Lp/mr20;", "Landroid/net/Uri;", "uri", "removeTemporaryFile", "(Landroid/net/Uri;)V", "Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "resolveTemporaryFile", "(Landroid/net/Uri;)Lcom/spotify/localfiles/localfilesmonorepo/AddedLocalFile;", "registerTemporaryFile", "Lcom/spotify/localfiles/mediastore/OpenedAudioFiles;", "Lp/xde0;", "src_main_java_com_spotify_localfiles_localfilescore-localfilescore"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocalFilesFeatureImpl implements LocalFilesFeature {
    private final xde0 localFilesClient;
    private final OpenedAudioFiles openedAudioFiles;

    /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$clearLocalFileSources$1, reason: invalid class name */
    @q8r(c = "com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl", f = "LocalFilesFeatureImpl.kt", l = {39, 40}, m = "clearLocalFileSources", v = 2)
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1 extends onm {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(lnm<? super AnonymousClass1> lnmVar) {
            super(lnmVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalFilesFeatureImpl.this.clearLocalFileSources(this);
        }
    }

    /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$setEnabled$1, reason: invalid class name and case insensitive filesystem */
    @q8r(c = "com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl", f = "LocalFilesFeatureImpl.kt", l = {20, 21, 27, 29}, m = "setEnabled", v = 2)
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C00001 extends onm {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C00001(lnm<? super C00001> lnmVar) {
            super(lnmVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalFilesFeatureImpl.this.setEnabled(false, this);
        }
    }

    public LocalFilesFeatureImpl(OpenedAudioFiles openedAudioFiles, xde0 xde0Var) {
        this.openedAudioFiles = openedAudioFiles;
        this.localFilesClient = xde0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x006e->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r9 == r6) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object clearLocalFileSources(p.lnm<? super p.rih1> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$clearLocalFileSources$1 r0 = (com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$clearLocalFileSources$1 r0 = new com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$clearLocalFileSources$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L48
            if (r1 == r4) goto L44
            if (r1 != r3) goto L3e
            int r1 = r0.I$0
            java.lang.Object r4 = r0.L$4
            com.spotify.local_files_esperanto.proto.EsLocalFiles$Folder r4 = (com.spotify.local_files_esperanto.proto.EsLocalFiles$Folder) r4
            java.lang.Object r4 = r0.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r7 = r0.L$1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = r0.L$0
            com.spotify.local_files_esperanto.proto.EsLocalFiles$GetSourcesResponse r7 = (com.spotify.local_files_esperanto.proto.EsLocalFiles$GetSourcesResponse) r7
            p.hm5.M(r9)
            goto L6e
        L3e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L44:
            p.hm5.M(r9)
            goto L62
        L48:
            p.hm5.M(r9)
            p.xde0 r9 = r8.localFilesClient
            p.y5x r1 = com.google.protobuf.Empty.o()
            com.google.protobuf.h r1 = r1.build()
            com.google.protobuf.Empty r1 = (com.google.protobuf.Empty) r1
            r0.label = r4
            p.eee0 r9 = (p.eee0) r9
            java.lang.Object r9 = r9.a(r1, r0)
            if (r9 != r6) goto L62
            goto L97
        L62:
            com.spotify.local_files_esperanto.proto.EsLocalFiles$GetSourcesResponse r9 = (com.spotify.local_files_esperanto.proto.EsLocalFiles$GetSourcesResponse) r9
            p.h290 r9 = r9.o()
            java.util.Iterator r9 = r9.iterator()
            r4 = r9
            r1 = r2
        L6e:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L98
            java.lang.Object r9 = r4.next()
            com.spotify.local_files_esperanto.proto.EsLocalFiles$Folder r9 = (com.spotify.local_files_esperanto.proto.EsLocalFiles$Folder) r9
            p.xde0 r7 = r8.localFilesClient
            r9.getClass()
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r5
            r0.L$4 = r5
            r0.I$0 = r1
            r0.I$1 = r2
            r0.label = r3
            p.eee0 r7 = (p.eee0) r7
            java.lang.Object r9 = r7.d(r9, r0)
            if (r9 != r6) goto L6e
        L97:
            return r6
        L98:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl.clearLocalFileSources(p.lnm):java.lang.Object");
    }

    @Override // com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature
    public mr20 isEnabled() {
        final mnc0 mnc0Var = new mnc0(this.localFilesClient.callStream("spotify.local_files_esperanto.proto.LocalFiles", "SubscribeSources", Empty.o().build()), (byte) 25);
        return new mr20() { // from class: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$isEnabled$$inlined$map$1

            /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$isEnabled$$inlined$map$1$2, reason: invalid class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements vr20 {
                final /* synthetic */ vr20 $this_unsafeFlow;

                /* JADX INFO: renamed from: com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$isEnabled$$inlined$map$1$2$1, reason: invalid class name */
                @q8r(c = "com.spotify.localfiles.localfilescore.LocalFilesFeatureImpl$isEnabled$$inlined$map$1$2", f = "LocalFilesFeatureImpl.kt", l = {217}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                public static final class AnonymousClass1 extends onm {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    Object L$4;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(lnm lnmVar) {
                        super(lnmVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(vr20 vr20Var) {
                    this.$this_unsafeFlow = vr20Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                public final Object emit(Object obj, lnm lnmVar) {
                    AnonymousClass1 anonymousClass1;
                    boolean z;
                    if (lnmVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) lnmVar;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(lnmVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(lnmVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        hm5.M(obj2);
                        vr20 vr20Var = this.$this_unsafeFlow;
                        h290 h290VarN = ((EsLocalFiles$GetSourcesResponse) obj).n();
                        if (!h290VarN.isEmpty()) {
                            Iterator<T> it = h290VarN.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                EsLocalFiles$DefaultSource esLocalFiles$DefaultSource = (EsLocalFiles$DefaultSource) it.next();
                                if (esLocalFiles$DefaultSource.getEnabled() && esLocalFiles$DefaultSource.n() == ynz.ANDROID_MEDIA_STORE) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        Object objEmit = vr20Var.emit(boolValueOf, anonymousClass1);
                        d9n d9nVar = d9n.a;
                        if (objEmit == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i2 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj2);
                    }
                    return rih1.a;
                }
            }

            public Object collect(vr20 vr20Var, lnm lnmVar) {
                Object objCollect = mnc0Var.collect(new AnonymousClass2(vr20Var), lnmVar);
                return objCollect == d9n.a ? objCollect : rih1.a;
            }
        };
    }

    @Override // com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature
    public void registerTemporaryFile(Uri uri) {
        this.openedAudioFiles.registerTemporary(uri);
    }

    @Override // com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature
    public void removeTemporaryFile(Uri uri) {
        this.openedAudioFiles.removeTemporary(uri);
    }

    @Override // com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature
    public AddedLocalFile resolveTemporaryFile(Uri uri) {
        return this.openedAudioFiles.resolveTemporary(uri);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature
    public Object setEnabled(boolean z, lnm<? super rih1> lnmVar) {
        C00001 c00001;
        eee0 eee0Var;
        Empty emptyBuild;
        if (lnmVar instanceof C00001) {
            c00001 = (C00001) lnmVar;
            int i = c00001.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00001.label = i - Integer.MIN_VALUE;
            } else {
                c00001 = new C00001(lnmVar);
            }
        } else {
            c00001 = new C00001(lnmVar);
        }
        Object obj = c00001.result;
        int i2 = c00001.label;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (z) {
                c00001.Z$0 = z;
                c00001.label = 1;
                if (clearLocalFileSources(c00001) != d9nVar) {
                }
            } else {
                eee0 eee0Var2 = this.localFilesClient;
                xnz xnzVarO = EsLocalFiles$DefaultSource.o();
                xnzVarO.q();
                xnzVarO.n(false);
                EsLocalFiles$DefaultSource esLocalFiles$DefaultSource = (EsLocalFiles$DefaultSource) xnzVarO.build();
                c00001.Z$0 = z;
                c00001.label = 4;
                if (eee0Var2.b(esLocalFiles$DefaultSource, c00001) != d9nVar) {
                    return rih1Var;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            z = c00001.Z$0;
            hm5.M(obj);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                if (i2 == 4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = c00001.Z$0;
            hm5.M(obj);
        }
        eee0Var = this.localFilesClient;
        emptyBuild = Empty.o().build();
        c00001.Z$0 = z;
        c00001.label = 3;
        if (eee0Var.c(emptyBuild, c00001) != d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        eee0 eee0Var3 = this.localFilesClient;
        xnz xnzVarO2 = EsLocalFiles$DefaultSource.o();
        xnzVarO2.q();
        xnzVarO2.n(true);
        EsLocalFiles$DefaultSource esLocalFiles$DefaultSource2 = (EsLocalFiles$DefaultSource) xnzVarO2.build();
        c00001.Z$0 = z;
        c00001.label = 2;
        if (eee0Var3.b(esLocalFiles$DefaultSource2, c00001) != d9nVar) {
            eee0Var = this.localFilesClient;
            emptyBuild = Empty.o().build();
            c00001.Z$0 = z;
            c00001.label = 3;
            if (eee0Var.c(emptyBuild, c00001) != d9nVar) {
                return rih1Var;
            }
        }
        return d9nVar;
    }
}
