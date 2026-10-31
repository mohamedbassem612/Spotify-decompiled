package p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.video.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ojs implements rd21 {
    public final Context a;
    public final uf0 b;
    public boolean c = false;
    public long d = 5000;

    public ojs(Context context) {
        this.a = context;
        this.b = new uf0(context);
    }

    @Override // p.rd21
    public final void a(jca jcaVar) {
        byte b = jcaVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.rd21
    public jca[] b(Handler handler, qwj1 qwj1Var, t38 t38Var, hbe1 hbe1Var, plj0 plj0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList();
        d(this.a, this.c ? 1 : 0, handler, qwj1Var, this.d, arrayList);
        Context context = this.a;
        ygr ygrVarC = c(context, false);
        boolean z = this.c;
        xjh0 xjh0VarE = e();
        Context context2 = this.a;
        arrayList.add(new zjh0(context2, xjh0VarE, handler, t38Var, ygrVarC));
        if (z != 0) {
            int size = arrayList.size();
            if (z == 2) {
                size--;
            }
            try {
                try {
                    i = size + 1;
                    try {
                        arrayList.add(size, (jca) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, t38.class, m48.class).newInstance(context2, handler, t38Var, ygrVarC));
                        oon1.A("Loaded MidiRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i;
                        i = size;
                    }
                } catch (ClassNotFoundException unused2) {
                }
                try {
                    try {
                        jca jcaVar = (jca) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, t38.class, m48.class).newInstance(handler, t38Var, ygrVarC);
                        i2 = i + 1;
                        try {
                            arrayList.add(i, jcaVar);
                            oon1.A("Loaded LibopusAudioRenderer.");
                        } catch (ClassNotFoundException unused3) {
                            i = i2;
                            i2 = i;
                        }
                    } catch (ClassNotFoundException unused4) {
                    }
                    try {
                        try {
                            i3 = i2 + 1;
                            try {
                                arrayList.add(i2, (jca) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, t38.class, m48.class).newInstance(handler, t38Var, ygrVarC));
                                oon1.A("Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused5) {
                                i2 = i3;
                                i3 = i2;
                            }
                        } catch (ClassNotFoundException unused6) {
                        }
                        try {
                            try {
                                jca jcaVar2 = (jca) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, t38.class, m48.class).newInstance(handler, t38Var, ygrVarC);
                                i4 = i3 + 1;
                                try {
                                    arrayList.add(i3, jcaVar2);
                                    oon1.A("Loaded FfmpegAudioRenderer.");
                                } catch (ClassNotFoundException unused7) {
                                    i3 = i4;
                                    i4 = i3;
                                }
                            } catch (ClassNotFoundException unused8) {
                            }
                            try {
                                try {
                                    Class<?> cls = Class.forName("androidx.media3.decoder.iamf.IamfAudioRenderer$Builder");
                                    Object objNewInstance = cls.getConstructor(m48.class).newInstance(ygrVarC);
                                    cls.getMethod("setEventHandlerAndListener", Handler.class, t38.class).invoke(objNewInstance, handler, t38Var);
                                    jca jcaVar3 = (jca) cls.getMethod("build", null).invoke(objNewInstance, null);
                                    jcaVar3.getClass();
                                    i5 = i4 + 1;
                                    try {
                                        arrayList.add(i4, jcaVar3);
                                        oon1.A("Loaded IamfAudioRenderer.");
                                    } catch (ReflectiveOperationException unused9) {
                                        i4 = i5;
                                        i5 = i4;
                                    }
                                } catch (ReflectiveOperationException unused10) {
                                }
                                try {
                                    arrayList.add(i5, (jca) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, t38.class, m48.class).newInstance(handler, t38Var, ygrVarC));
                                    oon1.A("Loaded MpeghAudioRenderer.");
                                } catch (ClassNotFoundException unused11) {
                                } catch (Exception e) {
                                    k220.p("Error instantiating MPEG-H extension", e);
                                }
                            } catch (Exception e2) {
                                k220.p("Error instantiating IAMF extension", e2);
                            }
                        } catch (Exception e3) {
                            k220.p("Error instantiating FFmpeg extension", e3);
                        }
                    } catch (Exception e4) {
                        k220.p("Error instantiating FLAC extension", e4);
                    }
                } catch (Exception e5) {
                    k220.p("Error instantiating Opus extension", e5);
                }
            } catch (Exception e6) {
                k220.p("Error instantiating MIDI extension", e6);
            }
        }
        arrayList.add(new mce1(hbe1Var, handler.getLooper()));
        Looper looper = handler.getLooper();
        for (int i6 = 0; i6 < 4; i6++) {
            arrayList.add(new rlj0(plj0Var, looper));
        }
        arrayList.add(new j4d());
        arrayList.add(new uy70(new fxa(context, (byte) 0)));
        return (jca[]) arrayList.toArray(new jca[0]);
    }

    public ygr c(Context context, boolean z) {
        vgr vgrVar = new vgr(context);
        vgrVar.a = z;
        return vgrVar.g();
    }

    public void d(Context context, int i, Handler handler, qwj1 qwj1Var, long j, ArrayList arrayList) {
        int i2;
        int i3;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        kkh0 kkh0Var = new kkh0(context);
        kkh0Var.c = e();
        kkh0Var.d = j;
        boolean z = false;
        kkh0Var.e = false;
        kkh0Var.f = handler;
        kkh0Var.g = qwj1Var;
        kkh0Var.h = (byte) 50;
        dm5.y(!kkh0Var.b);
        Handler handler2 = kkh0Var.f;
        if ((handler2 == null && kkh0Var.g == null) || (handler2 != null && kkh0Var.g != null)) {
            z = true;
        }
        dm5.y(z);
        kkh0Var.b = true;
        arrayList.add(new b(kkh0Var));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (jca) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, qwj1.class, cls).newInstance(Long.valueOf(j), handler, qwj1Var, 50));
                    oon1.A("Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i2;
                    i2 = size;
                }
            } catch (Exception e) {
                k220.p("Error instantiating VP9 extension", e);
                return;
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            try {
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (jca) Class.forName("androidx.media3.decoder.av1.Libdav1dVideoRenderer").getConstructor(cls2, Handler.class, qwj1.class, cls).newInstance(Long.valueOf(j), handler, qwj1Var, 50));
                    oon1.A("Loaded Libdav1dVideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i2 = i3;
                    i3 = i2;
                }
            } catch (Exception e2) {
                k220.p("Error instantiating AV1 extension", e2);
                return;
            }
        } catch (ClassNotFoundException unused4) {
        }
        try {
            arrayList.add(i3, (jca) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, qwj1.class, cls).newInstance(Long.valueOf(j), handler, qwj1Var, 50));
            oon1.A("Loaded FfmpegVideoRenderer.");
        } catch (ClassNotFoundException unused5) {
        } catch (Exception e3) {
            k220.p("Error instantiating FFmpeg extension", e3);
        }
    }

    public xjh0 e() {
        return this.b;
    }
}
