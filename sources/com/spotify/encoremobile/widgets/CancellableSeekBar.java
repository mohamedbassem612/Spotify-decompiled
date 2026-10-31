package com.spotify.encoremobile.widgets;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import p.aiq0;
import p.fe;
import p.lk5;
import p.shd;
import p.thd;
import p.unz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Deprecated
public class CancellableSeekBar extends lk5 {
    public static final /* synthetic */ int i = 0;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public thd f;
    public float g;
    public final Object h;

    public CancellableSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.h = new Object();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, unz0.a);
        this.g = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a() {
        if (this.c) {
            onTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
            this.b = true;
            this.c = false;
            synchronized (this.h) {
                setProgress(this.e);
            }
            thd thdVar = this.f;
            if (thdVar != null) {
                thdVar.a(this);
            }
        }
    }

    public float getCancelDistance() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        aiq0.a(this, new fe(this, (byte) 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        try {
            this.d = true;
            int action = motionEvent.getAction();
            if (this.b) {
                if (action == 1 || action == 3) {
                    this.b = false;
                    this.c = false;
                }
                this.d = false;
                return true;
            }
            if (action == 0) {
                this.c = true;
                synchronized (this.h) {
                    this.e = getProgress();
                }
            }
            if (motionEvent.getY() >= (-this.g) && motionEvent.getY() <= getHeight() + this.g) {
                if (action == 1) {
                    this.c = false;
                }
                boolean zOnTouchEvent = super/*android.view.View*/.onTouchEvent(motionEvent);
                this.d = false;
                return zOnTouchEvent;
            }
            this.b = true;
            motionEvent.setAction(3);
            thd thdVar = this.f;
            if (thdVar != null) {
                thdVar.b = true;
            }
            boolean zOnTouchEvent2 = super/*android.view.View*/.onTouchEvent(motionEvent);
            synchronized (this.h) {
                setProgress(this.e);
            }
            thd thdVar2 = this.f;
            if (thdVar2 != null) {
                thdVar2.a(this);
            }
            this.d = false;
            return zOnTouchEvent2;
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void setCancelDistance(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.g = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnSeekBarChangeListener(shd shdVar) {
        thd thdVar;
        if (shdVar == null) {
            thdVar = null;
            this.f = null;
        } else {
            thd thdVar2 = new thd(shdVar, (byte) 0);
            this.f = thdVar2;
            thdVar = thdVar2;
        }
        super/*android.widget.SeekBar*/.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) thdVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setProgress(int i2) {
        try {
            if (this.d || !this.c || this.b) {
                super/*android.widget.ProgressBar*/.setProgress(i2);
            } else {
                this.e = i2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        thd thdVar;
        if (onSeekBarChangeListener == null) {
            thdVar = null;
            this.f = null;
        } else {
            thd thdVar2 = new thd(onSeekBarChangeListener, (byte) 0);
            this.f = thdVar2;
            thdVar = thdVar2;
        }
        super/*android.widget.SeekBar*/.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) thdVar);
    }

    public CancellableSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public CancellableSeekBar(Context context) {
        this(context, null);
    }
}
